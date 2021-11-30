import java.util.Scanner;

public class Ex7 {
    // פונקציה שמקבלת מערך CHAR ומדפיסה את תשעת התוים כ3*3
    public static void printBoard(char[] yourArrayChar) {
        yourArrayChar = new char[9];
        int numbersOfRow = 3;
        for (int i = 0; i < yourArrayChar.length; i++) {
            if (i % numbersOfRow == 0) {
                System.out.println();
            }
            System.out.print(yourArrayChar[i]);
        }
    }

    //        פונקציה שמחזריה שקר אם הערך באינדקס המוזן הוא X או 0
    public static boolean isAvailable(char[] yourCharArray, int indexArray) {
        boolean isItXor0 = true;
        if (yourCharArray[indexArray] == 'x' || yourCharArray[indexArray] == 'X' || yourCharArray[indexArray] == '0') {
            isItXor0 = false;
        }
        return isItXor0;
    }

    //    פונקציה שמזינה את הX או 0 במיקום שהמשתמש בוחר בין 0-8
    public static void getPositionFromUser(char[] yourCharArray, char symbolPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the position of your sign: ");
        int positionYourSign = scanner.nextInt();
        while (positionYourSign < 1 || positionYourSign > 9) {  // בדיקה שהמספר בין 1 ל9
            System.out.println("You need to enter a number between 1 and 9!");
            System.out.println("enter again the position of your sign: ");
            positionYourSign = scanner.nextInt();
        }
        //  בדיקה שהסמל הוא X או 0
        while (yourCharArray[positionYourSign-1] == 'x' || yourCharArray[positionYourSign-1] == 'X' || yourCharArray[positionYourSign-1] == '0') {
            System.out.println("this index is catch!");
            System.out.println("enter again the position of your sign: ");
            positionYourSign = scanner.nextInt();
        }
        System.out.println("wich player turn?");
        symbolPlayer=scanner.next().charAt(0);
        while (symbolPlayer!='0' && symbolPlayer!='x' && symbolPlayer!='X' ) {
            System.out.println("your symbol must be X or 0, enter your symbol again:");
            symbolPlayer=scanner.next().charAt(0);
        }
        yourCharArray[positionYourSign-1]=symbolPlayer;

    }

    // פונקציה הבודקת אם יש מנצח
    public static char checkWinner(char[] yourCharArray) { //  הפונקציה לא מחזירה ישר מנצח היא מסתיימת ורק אז..
        char theWinnerIs = '-' ;
        //      בדיקה על x (קטנה)
        if (yourCharArray[0] == 'x' && yourCharArray[1] == 'x' && yourCharArray[2] == 'x') {
            System.out.println("the winner is: x !!!");
            return theWinnerIs='x';
        } else if (yourCharArray[3] == 'x' && yourCharArray[4] == 'x' && yourCharArray[5] == 'x') {
            System.out.println("the winner is: x !!!");
            return theWinnerIs='x';
        } else if (yourCharArray[6] == 'x' && yourCharArray[7] == 'x' && yourCharArray[8] == 'x') {
            System.out.println("the winner is: x !!!");
            return theWinnerIs='x';
        } else if (yourCharArray[0] == 'x' && yourCharArray[4] == 'x' && yourCharArray[8] == 'x') {
            System.out.println("the winner is: x !!!");
            return theWinnerIs='x';
        } else if (yourCharArray[2] == 'x' && yourCharArray[4] == 'x' && yourCharArray[6] == 'x') {
            System.out.println("the winner is: x !!!");
            return theWinnerIs='x';
        } else if (yourCharArray[0] == 'x' && yourCharArray[3] == 'x' && yourCharArray[6] == 'x') {
            System.out.println("the winner is: x !!!");
            return theWinnerIs= 'x';
        } else if (yourCharArray[2] == 'x' && yourCharArray[5] == 'x' && yourCharArray[8] == 'x') {
            System.out.println("the winner is: x !!!");
            return theWinnerIs='x';
        } else if (yourCharArray[1] == 'x' && yourCharArray[4] == 'x' && yourCharArray[7] == 'x') {
            System.out.println("the winner is: x !!!");
            return theWinnerIs='x';
            //      בדיקה על x (גדולה)
        } else if (yourCharArray[0] == 'X' && yourCharArray[1] == 'X' && yourCharArray[2] == 'X') {
            System.out.println("the winner is: X !!!");
            return theWinnerIs='X';
        } else if (yourCharArray[3] == 'X' && yourCharArray[4] == 'X' && yourCharArray[5] == 'X') {
            System.out.println("the winner is: X !!!");
            return theWinnerIs='X';
        } else if (yourCharArray[6] == 'X' && yourCharArray[7] == 'X' && yourCharArray[8] == 'X') {
            System.out.println("the winner is: X !!!");
            return theWinnerIs='X';
        } else if (yourCharArray[0] == 'X' && yourCharArray[4] == 'X' && yourCharArray[8] == 'X') {
            System.out.println("the winner is: X !!!");
            return theWinnerIs= 'X';
        } else if (yourCharArray[2] == 'X' && yourCharArray[4] == 'X' && yourCharArray[6] == 'X') {
            System.out.println("the winner is: X !!!");
            return theWinnerIs='X';
        } else if (yourCharArray[0] == 'X' && yourCharArray[3] == 'X' && yourCharArray[6] == 'X') {
            System.out.println("the winner is: X !!!");
            return theWinnerIs='X';
        } else if (yourCharArray[2] == 'X' && yourCharArray[5] == 'X' && yourCharArray[8] == 'X') {
            System.out.println("the winner is: X !!!");
            return theWinnerIs='X';
        }else if (yourCharArray[1] == 'X' && yourCharArray[4] == 'X' && yourCharArray[7] == 'X') {
                System.out.println("the winner is: X !!!");
                return theWinnerIs= 'X';
                        //  בדיקה על 0
        } else if (yourCharArray[0] == '0' && yourCharArray[1] == '0' && yourCharArray[2] == '0') {
            System.out.println("the winner is: 0 !!!");
            return theWinnerIs='0';
        } else if (yourCharArray[3] == '0' && yourCharArray[4] == '0' && yourCharArray[5] == '0') {
            System.out.println("the winner is: 0 !!!");
            return theWinnerIs='0';
        } else if (yourCharArray[6] == '0' && yourCharArray[7] == '0' && yourCharArray[8] == '0') {
            System.out.println("the winner is: 0 !!!");
            return theWinnerIs='0';
        } else if (yourCharArray[0] == '0' && yourCharArray[4] == '0' && yourCharArray[8] == '0') {
            System.out.println("the winner is: 0 !!!");
            return theWinnerIs='0';
        } else if (yourCharArray[2] == '0' && yourCharArray[4] == '0' && yourCharArray[6] == '0') {
            System.out.println("the winner is: 0 !!!");
            return theWinnerIs='0';
        } else if (yourCharArray[0] == '0' && yourCharArray[3] == '0' && yourCharArray[6] == '0') {
            System.out.println("the winner is: 0 !!!");
            return theWinnerIs='0';
        } else if (yourCharArray[2] == '0' && yourCharArray[5] == '0' && yourCharArray[8] == '0') {
            System.out.println("the winner is: 0 !!!");
            return theWinnerIs='0';
        } else if (yourCharArray[1] == '0' && yourCharArray[4] == '0' && yourCharArray[7] == '0') {
            System.out.println("the winner is: 0 !!!");
            return theWinnerIs='0';
        }

        System.out.println();
        System.out.println(theWinnerIs);
        return theWinnerIs;
    }

    //  הפונקציה המשלבת את כל הפונקציות
    public static boolean placeSymbolOnBoard(char[] yourCharArray, int yourLocationBoard, char symbolPlayer) {
        Scanner scanner= new Scanner(System.in);
        boolean thereIsWinner = false;
        for (int i=0;i<yourCharArray.length;i++) {  //  בדיקה שלא הוזן מערך עם תווים שכוללים 0 או X
            if (isAvailable(yourCharArray, i) == false) {
                System.out.println("enter a new char in index number "+i+",which will not include- x or 0 !");
                yourCharArray[i] = scanner.next().charAt(0);
            }
        }

        System.out.println("x always start!");
        for (int i=0;i<yourCharArray.length;i++) {  //  לולאה לפונקציה שמזינה את הסמל הנבחר במקום הניבחר
            getPositionFromUser(yourCharArray, symbolPlayer);
            printBoard(yourCharArray);
            System.out.println();
            //  בדיקה האם יש מנצח ומה זהותו
            if (checkWinner(yourCharArray) != '-') {
                System.out.println("congratulations you are a real champ!!!");
                thereIsWinner = true;
                break;
            }
        }
        System.out.println(thereIsWinner);
        return thereIsWinner;
    }

    public static void main(String[] args) {
        char[] example = {'*', '*', '*', '*', '@', 'g', '@', '@', 'a'};
        //   פונקצית המשחק
            placeSymbolOnBoard(example, 0, 'x');

            //  הדפסה של אברי המערך
        int numbersOfRow = 3;
        for (int j = 0; j < example.length; j++) {
            if (j % numbersOfRow == 0) {
                System.out.println();
            }
            System.out.print((example[j]));
        }
        }
    }

