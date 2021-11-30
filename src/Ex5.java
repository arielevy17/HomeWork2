public class Ex5 {
    public static int summitOfArrayRisingFalling(int [] yourArrayNumbers) {
        int summit = -1;
        int i = 0;
        //   ווידוא שהסידרה מתחילה מעלייה
        if (yourArrayNumbers[0]<yourArrayNumbers[1]){
            summit=yourArrayNumbers[1];
        }

        for (i = 1; i < yourArrayNumbers.length; i++) {
            if (yourArrayNumbers[i-1] < yourArrayNumbers[i]) {
                summit = yourArrayNumbers[i];
            }
            else {
                break;
            }
        }
        // וידוא שהסידרה לא רק עולה
        if (summit==yourArrayNumbers[yourArrayNumbers.length-1]) {
            summit = -1;
        }
            //  ווידוא שהסדרה מהפיסגה והלאה רק בירידה
            for (i = i; i < yourArrayNumbers.length-1; i++) {
                if (yourArrayNumbers[i-1] > yourArrayNumbers[i]) {
                    if (yourArrayNumbers[i] < yourArrayNumbers[i + 1]) {
                        summit = -1;
                        break;
                    }
                }
            }
        return summit;
    }

    public static void main(String[] args) {
        int [] exampleArray={0,1,32,3,7,5,4,0};
        System.out.println(summitOfArrayRisingFalling(exampleArray));
    }
}
