package common.programs.strings;

//Given a string which has white spaces,capitalized letters and punctuations, ignore those and return true if it is pallindrome
public class PallindroStringWithPunctuationAndSpaces {
    public static void main(String[] args) {
        String s = "raceCa,,.r";
        System.out.println(method1(s));
    }

    //Skipping all the non-digit and non-letter characters
    public static boolean method1(String s){
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Changing the original string by removing all the whitespaces and punctuations and converting to lower case
    public static boolean method2(String s){
        s = s.toLowerCase();
        s = s.replaceAll("\\s","");     //removing all the whitespaces
        s = s.replaceAll("\\p{Punct}","");      //removing all the punctuations

        int i = 0;
        int j = s.length()-1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
