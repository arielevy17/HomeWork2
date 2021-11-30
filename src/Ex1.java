public class Ex1 {
    public static boolean stringChecking(String word1, String word2) {
        boolean ans = false;
        for (int i=0 ,j = 0; i < word1.length() && j < word2.length() ; i++) {
            if (word1.charAt(i) == word2.charAt(j) ) {
                    ans = true;
                    j++;
                }
            else {
                    ans = false;
                    j=0;
                }

            }
        return ans;
        }


    public static void main(String[] args) {
        System.out.println(stringChecking("my name is arie levy","arie"));

    }
}
