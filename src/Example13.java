import java.util.Scanner;

public class Example13 {
    public static void main(String [] argv) {
        int number1;
        int number2;
        int number3;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write first number");
        number1 = inputValue.nextInt();

        System.out.println("Write second number");
        number2 = inputValue.nextInt();

        System.out.println("Write third number");
        number3 = inputValue.nextInt();

        if(number1 > number2) {
            if(number1 > number3){
                System.out.println("First number is biggest");
            }
        } else if(number2 > number3) {
            System.out.println("the biggest is second number");
        } else {
            System.out.println("the biggest is third number");
        }

    }
}