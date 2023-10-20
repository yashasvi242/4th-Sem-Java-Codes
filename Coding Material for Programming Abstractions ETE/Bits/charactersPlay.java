public class charactersPlay {
    
    public static void main(String args[]){

        String str = "aBc1C";

        String newStr = "";
        for(int i=0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)))
                newStr += Character.toLowerCase(str.charAt(i));
            else newStr += Character.toUpperCase(str.charAt(i));
        }

        System.out.println(newStr);
    }
}

// Character.isUpperCase(ch)
// Character.isLowerCase(ch)
// ch = Character.toLowerCase(prvChar);
// ch = Character.toUpperCase(prvChar);

