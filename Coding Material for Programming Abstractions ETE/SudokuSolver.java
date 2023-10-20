 /*✔️⭐Approach - 1[in java] (backtracking, recursion)

        explanation :- 

                    ->// Fun.3 - isSafeToPlace() returns true if we can place the value at row, col else returns false

                            step 1: to check if the value exists, first covert it into string and then save the 0th character of this string into a character 'charValue' which saves 9 as '9' 
                            step 2 : run a loop from 0 to n-1
                                step 2.1 : complete row check, if we find charValue in any cell of the row, return false
                                step 2.2 : complete coloumn check, if we find charValue in any cell of the col, return false
                                step 2.3 complete grid check, if we find charValue in any 
                            step 3 : all safe, return true

                    -> // Fun.2 - solve() - fill the board with solution

                            step 1 : run 2 nested loops 1st row = 0 to n-1, 2nd col = 0 to n-1
                                    step 2 : whenever a cell is empty 
                                        step 3 : run a loop from 1 to 9, matlab values try karo insert karke dekho 1 to 9 tak 
                                            step 4 : call fun.3 : isSafe(), if at the current row and col coordinated, its safe to place val, then  
                                                step 5 : if we directly convert int to char then it would change it into some character , but we want it as '9', for that convert int to string, then fetch the char of that string and save it 
                                                step 6 : do recursive call, and save output in 'isSolutionFound' 
                                                step 7 : agar age koi solution mil gaya to yaha se bhi return kardo true
                                                step 8 : agar koi solution nahi mila to abhi jo value insert kiya tha usko hatao i.e backtrack karo
                                        step 9 : agar sari values dalke dekhliya aur koi 
                            step 10 : agar sari cells khatam ho gai, matlab return kardo true, ke koi solution mil gaya h 


                ->// Main function
                    step 1 : call solve() 

        ✅Time : O(9^m) means we have 9 choices to make in the m empty cells of a 9 by 9 matrix
        ✅Space : O(1) - because at max there can be o(81) recursive calls, which is a constant 


    */
class Solution {

    static boolean isSafeToPlace(char[][] board, int row, int col, int num){

        String strNum = String.valueOf(num);
        char value = strNum.charAt(0);
        int n = board.length;

        for(int i=0; i < n; i++){

            // complete row check
            if(board[row][i] == value) return false;
            // complete col check
            if(board[i][col] == value) return false;
            // complete block check (each block has 9 cells)
            if(board[3*(row/3) + i/3][ 3*(col/3) + i%3] == value) return false;
        }

        return true; // safe to place
    }
    static boolean solve(char[][] board){

        int n = board.length;
        for(int row=0; row < n; row++){
            for(int col=0; col < n; col++){

                // if current cell is empty then proceed
                if(board[row][col] == '.'){
                    // try all numbers from 1 to 9 and find which one fits
                    for(int num=1; num <= 9; num++){
                        if(isSafeToPlace(board, row, col, num)){ // if current number firs the current cell, then place it
                            
                            String numStr = String.valueOf(num);
                            char ch = numStr.charAt(0);
                            board[row][col] = ch; // convert num to string to character form (not asci)

                            // check if a solution can be possible with this 
                            boolean solutionFound = solve(board);
                            if(solutionFound == true) return true;
                            else board[row][col] = '.'; // backtrack
                        }
                    }
                    return false; // tried all values still no answer found for this board
                }

            }
        }

        return true; // all cells filled

        
    }
    public void solveSudoku(char[][] board) {

        solve(board);
        
    }
}