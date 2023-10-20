
// ✔️Approach - 1 (in java) (recursive backtracking, unpotimised)

class Solution {
    // fun 4 
static boolean isSafeToPlace(ArrayList<ArrayList<Character>> board, int row, int col){

        int n  = board.size();
        int currRow = row;
        int currCol = col;

        // check right to left horizontally 
        for(; currCol >= 0; currCol--)
            if(board.get(currRow).get(currCol) == 'Q')
                return false;

        // check diaginally down to up 
        currRow = row;
        currCol = col;
        while(currRow >= 0 && currCol >= 0){
            if(board.get(currRow).get(currCol) == 'Q')
                return false;
            currRow--;
            currCol--;
        }

        // check diaginally up to down 
        currRow = row;
        currCol = col;
        while(currRow < n && currCol >= 0){
            if(board.get(currRow).get(currCol) == 'Q')
                return false;
            currRow++;
            currCol--;
        }

        return true;
    }

    // fun.3
    static void saveBoard(ArrayList<ArrayList<Character>> board, List<List<String>> allBoards, int n)
    {
        List<String> currBoard = new ArrayList<>(n);
        for(int row=0; row < n; row++){
            String temp = "";
            for(int col=0; col < n; col++)
                temp += (board.get(row).get(col));
            currBoard.add(temp);
        }
        allBoards.add(currBoard);

    }
    
    // fun.2 
    static void solve(ArrayList<ArrayList<Character>> board, int n, List<List<String>> allBoards, int col)
    {
        // if all columns are filled, then save the board in allBoards
        if(col == n){
            saveBoard(board, allBoards, n);
            return;
        }

        for(int row=0; row < n; row++){

            // if the Queen can be placed in the current cell then place it and move to next col
            if(isSafeToPlace(board, row, col)){
                board.get(row).set(col, 'Q');
                solve(board, n, allBoards, col + 1);
                board.get(row).set(col, '.'); //.set(index,ele) is used replace
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        ArrayList<ArrayList<Character>> board = new ArrayList<>(); // board with . at all cells 
        for(int row=0; row < n; row++){
            ArrayList<Character> singleRow = new ArrayList<>();
            for(int col=0; col < n; col++){ 
                singleRow.add('.');
            }
            board.add(singleRow);
        }

        // create a list of boards to return at the end 
        List<List<String>> allBoards = new ArrayList<>();
        int col = 0;
        // call the solve function which will chekc which board is valid
        solve(board, n, allBoards, col); // 0 is current col (we will fill each column 1 by 1)

        return allBoards;

        
    }
}

