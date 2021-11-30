public class Ex6 {
    // פונקציה שמחזירה מערך חיתוך:
    public static int [] intersectionArray (int [] yourArrayNumbers1, int [] yourArrayNumbers2) {
        int invalidNumber =0;
        int sameCounter =0;
        //   בדיקה כמה איברים יהיו במערך
        for (int i = 0,j=0; i < yourArrayNumbers1.length; i++) {
            int numberNotEnteredYet = 0;
            //  בדיקה שאין איבר כפול במערך הראשון (שדרכו בודקים כפילויות)
            for (int a = i + 1; a < yourArrayNumbers1.length; a++) {
                if (yourArrayNumbers1[i] != yourArrayNumbers1[a]) {
                    numberNotEnteredYet++;
                } else {
                    break;
                }
            }
            if (numberNotEnteredYet == yourArrayNumbers1.length - (i + 1)) {
                j = 0;
                for (j = 0; j < yourArrayNumbers2.length; j++) {
                    if (yourArrayNumbers1[i] == yourArrayNumbers2[j]) {
                        sameCounter++;
                        break;
                    }
                }
            }
        }
        int [] newArrayIntersection=new int[sameCounter];

        //    בדיקה שהמספר חיובי ודו סיפרתי
        for (int i=0; i<yourArrayNumbers1.length;i++){
            if (yourArrayNumbers1[i]<=9) {
                    invalidNumber++;
                    break;
            }
        }
        for (int i=0; i<yourArrayNumbers2.length;i++) {
            if (yourArrayNumbers2[i] <= 9) {
                invalidNumber++;
                break;
            }
        }
        if (invalidNumber >0){
            System.out.println("You must enter a positive, and double-digit number! ");
            return null;
        }
        else {
            sameCounter=0;
            int indexInNewArrayNumbers=0;
            // הזנת אברי המערך
            for (int i = 0,j=0; i < yourArrayNumbers1.length; i++) {
                j = 0;
                for (j = 0; j < yourArrayNumbers2.length; j++) {
                    if (yourArrayNumbers1[i] == yourArrayNumbers2[j]) {
                        //  בדיקה שהאיבר לא הוזן כבר
                        int numberNotEnteredYet = 0;
                        for (int a = 0; a < newArrayIntersection.length; a++) {
                            if (yourArrayNumbers1[i] != newArrayIntersection[a]) {
                                numberNotEnteredYet++;
                            }
                            else {
                                break;
                            }
                        }
                        if (numberNotEnteredYet == newArrayIntersection.length) {
                            newArrayIntersection[indexInNewArrayNumbers] = yourArrayNumbers1[i];
                            indexInNewArrayNumbers++;
                            break;
                        }
                    }
                }
            }
//     פקודת הדפסת אברי המערך-ע"מ שניתן יהיה לראות שהערך המוחזר נכון
            for (int j=0; j<newArrayIntersection.length;j++){
                System.out.print((newArrayIntersection[j])+"  ");
            }
            System.out.println();
        } return newArrayIntersection;
    }

    // פונקציה שמחזירה TRUE || FALSE בנוגע לאם המערכים זרים(ללא אותו ערכים במערך)
    public static boolean areTheArraysForeign(int [] yourArrayNumbers1, int [] yourArrayNumbers2 ){
      boolean isItFunctionIsIntersection=false;
      int [] newArrayNumber=intersectionArray(yourArrayNumbers1,yourArrayNumbers2);

      if (newArrayNumber==null){
          System.out.println();
        }
      else if (newArrayNumber.length==0){
          isItFunctionIsIntersection=true;
      }
      return isItFunctionIsIntersection;
    }


    public static void main(String[] args) {
        int [] exampleArray1 ={10,51,20,20};
        int [] exampleArray2 ={233,100,57,510,10,510,100};
        System.out.println(areTheArraysForeign(exampleArray1, exampleArray2));
    }
}
