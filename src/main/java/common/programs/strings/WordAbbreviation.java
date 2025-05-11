package common.programs.strings;

public class WordAbbreviation {
    public static void main(String[] args) {
        String word = "kkusiyrkmr";
        String abbr = "10";
        System.out.println(isAbbreviation(word,abbr));
    }

    public static boolean isAbbreviation(String word, String abbr){

        if(word == null || abbr == null){
            return false;
        }
        int p1 = 0;
        int p2 = 0;

        while(p1 < word.length() && p2 < abbr.length()) {

            if(Character.isDigit(abbr.charAt(p2))){
                if(abbr.charAt(p2) == '0'){
                    return false;
                }
                int num = 0;
                while(p2 < abbr.length() && Character.isDigit(abbr.charAt(p2))){
                    num = num * 10 + abbr.charAt(p2) - '0';
                    p2++;

                }
                p1 += num;
            }
            else {
                if(word.charAt(p1) != abbr.charAt(p2)){
                    return false;
                }

                p1++;
                p2++;
            }
        }

        return p1 == word.length() && p2 == abbr.length();
    }
}
