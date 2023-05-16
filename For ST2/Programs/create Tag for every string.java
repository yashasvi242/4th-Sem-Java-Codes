public class CompanyTag {
    
    /* Create a tag for each 'string' 
     
        input : "helloworld"
        output : "hlwrl"
        input : "electronics"
        out : "letois"

        explanation : (el)(ec)(tr)(on)(ic)s

                now for 1st pair l > e (push l in ans)
                now for pair e > c (push e in ans)
                now for pair t > r (push t in ans)
                now for pair o > n (push o in ans)
                now for pair i > c (push i in ans)

            result : letois


    */
    public static void main(String ... args){

        //input  
        // String str = "electronics"; ///output : letois
        String str = "helloworld"; ///output : hlwrl

        String resultStr = "";
        // for each adj grp of 2 characters, the one with higher asci will be choosed
        for(int i=0; i < str.length()-1; i+=2){

            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);

            if(ch1 > ch2){
                resultStr += ch1;
                System.out.println(ch1 + " > " + ch2);
            } 
            else{
                resultStr += ch2;
                System.out.println(ch1 + " < " + ch2);
            }
        }

        // if input str is of odd len then last character must had been left so include it 
        if(str.length() % 2 != 0)
            resultStr += str.charAt(str.length()-1);
        
        //resukt 
        System.out.println("Result : " + resultStr);
    }
}
