public class Ex3 {

       ///   פונקציית SUBSTRING מהתחלה עד יעד
    public static String subStringUntilDestination(String yourString, int destinationIndex) {
        String newString ="";
    for (int i=0; i<destinationIndex; i++) {
        newString = newString+yourString.charAt(i);
    }
    return newString;
    }

         /////פונקצית SUBSTRING מיעד עד הסוף
    public static String subStringFromDestination(String yourString, int destinationIndex) {
        String newString ="";
        for (int i=destinationIndex; i<yourString.length(); i++) {
            newString = newString+yourString.charAt(i);
        }
return newString;
    }

                ///פונקציה אשר מנרמלת מספרי טלפון ע"פ התבנית- *******-***
    public static String dialingPrefix(String yourPhoneNumber) {
        String correctPhoneNumber = "";
        char[] allNumbersAndHyphens = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-'};
        int correctCounter = 0;
        int wrongCounter = 0;

             ///בדיקה שהמחרוזת מורכב רק ממספרים או -
        for (int i = 0, j = 0; i < allNumbersAndHyphens.length && j < yourPhoneNumber.length(); i++) {
            if (yourPhoneNumber.charAt(j) == allNumbersAndHyphens[i]) {
                correctCounter++;
                j++;
                i = 0;
            }
        }
        if (correctCounter != yourPhoneNumber.length()) {
            return correctPhoneNumber ;
        } else {

                ///תנאי שהמחרוזת בין 10 ל12
            if (yourPhoneNumber.length() < 10 || yourPhoneNumber.length() > 12) {
                return correctPhoneNumber;
            } else {
                String secondPartOfPhoneNumber;
                char[] foreignPrefix = {'9', '7', '2', '5'};
                char[] possiblePrefixCharPlace3 = {'0', '1', '2', '3', '4', '5', '8'};
                char[] allNumbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

                    ///
                correctCounter =0;     //כאשר יש 05 בהתחלה
                if (yourPhoneNumber.charAt(0) == '0' && yourPhoneNumber.charAt(1) == '5') {
                    for (int i = 0; i < possiblePrefixCharPlace3.length; i++) {
                        // כאשר מספר שלישי תקין
                        if (yourPhoneNumber.charAt(2) == possiblePrefixCharPlace3[i]) {
                            if (yourPhoneNumber.length()==10 && yourPhoneNumber.charAt(3) !='-'){
                                return correctPhoneNumber = subStringUntilDestination(yourPhoneNumber, 2) + possiblePrefixCharPlace3[i] + '-' + subStringFromDestination(yourPhoneNumber, 3);
                            }
                            secondPartOfPhoneNumber = subStringFromDestination(yourPhoneNumber, 4);
                            for (int a = 0, j = 0; a < allNumbers.length && j < secondPartOfPhoneNumber.length(); a++) {
                                //  כאשר מספר מוזן בתבנית הרצויה
                                if (yourPhoneNumber.charAt(3) == '-' && secondPartOfPhoneNumber.charAt(j) == allNumbers[a] && yourPhoneNumber.length() == 11) {
                                    correctCounter++;
                                    j++;
                                    a = 0;
                                }
                            }

                             if (correctCounter == secondPartOfPhoneNumber.length()) {
                                return correctPhoneNumber = yourPhoneNumber;
                            }
                             else if (correctCounter != secondPartOfPhoneNumber.length()) {
                                 return correctPhoneNumber;
                             }
                        } else {
                            wrongCounter++;
                        }

                        if (wrongCounter == possiblePrefixCharPlace3.length) {
                            return correctPhoneNumber;
                        }
                    }
                } else {
                    wrongCounter = 0;
                    correctCounter = 0;
                     //  כאשר מספר מתחיל ב972
                    for (int i = 0; i < foreignPrefix.length; i++) {
                        if (yourPhoneNumber.charAt(i) == foreignPrefix[i] && yourPhoneNumber.length() == 12) {
                            correctCounter++;
                        } else {
                            return correctPhoneNumber;
                        }
                    }

                    if (correctCounter == foreignPrefix.length) {
                        correctPhoneNumber = "05";
                        for (int i = 0; i < possiblePrefixCharPlace3.length; i++) {
                            if (yourPhoneNumber.charAt(4) == possiblePrefixCharPlace3[i]) {
                                secondPartOfPhoneNumber = subStringFromDestination(yourPhoneNumber, 5);
                                return correctPhoneNumber = correctPhoneNumber + possiblePrefixCharPlace3[i] + '-' + secondPartOfPhoneNumber;
                            } else {
                                wrongCounter++;
                            }
                        }
                        if (wrongCounter == possiblePrefixCharPlace3.length) {
                            return correctPhoneNumber;
                        }
                    }
                    else {
                        return correctPhoneNumber;
                    }
                }
            }
        }  return correctPhoneNumber;
    }

        public static void main(String[] args) {
            System.out.println(dialingPrefix("972586489811"));

    }
}
