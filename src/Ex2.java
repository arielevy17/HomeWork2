import java.util.Scanner;

public class Ex2 {
    public static void numberAboveAverage(){
        int [] yourNumbers = new int[10];
        Scanner scanner= new Scanner(System.in);
            int indexNumber=1;
        double average=0;
            System.out.println("enter your 10 numbers:");
            for (int i=0; i<yourNumbers.length;i++,indexNumber++) {
                System.out.println("number " + indexNumber + ":");
                yourNumbers[i] = scanner.nextInt();
            }
        for (int i= 0; i<yourNumbers.length;i++) {
            average = yourNumbers[i] + average;
        }
        average= average/10F;
        System.out.print("your numbers above the average are: ");
        for (int i =0; i<yourNumbers.length; i++) {
            if (yourNumbers[i]>average){
                System.out.print(yourNumbers[i]+" ");
            }
        }
    }
}
