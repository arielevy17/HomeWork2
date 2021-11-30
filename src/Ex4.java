public class Ex4 {
    //    פונקציה אשר בודקת כפילויות מספרים במערך
    public static int[] ChecksDoubleNumbers(int [] yourArrayNumbers) {
        int sameCounter =0;
        for (int i = 0; i < yourArrayNumbers.length; i++) {
            for (int j = i+1; j < yourArrayNumbers.length; j++) {
                if (yourArrayNumbers[i] == yourArrayNumbers[j]) {
                    sameCounter++;
                    break;
                }
            }
        }
        int newArrayNumbers[] = new int [(yourArrayNumbers.length- sameCounter)];
        int indexInNewArrayNumbers=0;
        for (int i = 0; i < yourArrayNumbers.length; i++) {
            int notSameCounter = 0;
            for (int j = 0; j < newArrayNumbers.length; j++) {
                if (yourArrayNumbers[i] != newArrayNumbers[j]) {
                    notSameCounter++;
                }
            }
            if (notSameCounter == newArrayNumbers.length) {
                newArrayNumbers[indexInNewArrayNumbers] = yourArrayNumbers[i];
                indexInNewArrayNumbers++;
            }
        }

        //     פקודת הדפסת אברי המערך-ע"מ שניתן יהיה לראות שהערך המוחזר נכון
        for (int j=0; j<newArrayNumbers.length;j++){
            System.out.print((newArrayNumbers[j])+" ");
        }
        return newArrayNumbers;
    }

    public static void main(String[] args) {
        int [] example ={8,9,8,8,4,6,4,5,5,5,6,22,222,22};
        ChecksDoubleNumbers(example);
    }
}

