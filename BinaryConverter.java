import java.util.Scanner;

public class BinaryConverter {

    public static void main(String args []){
        Scanner myInput = new Scanner(System.in);

        System.out.println("Welcome to this Binary Converter");

        String answerContinue = "";
        //decision making block
        do {
            System.out.println("Is your number in base-10 or base-2?");
            String answer = myInput.nextLine();

            if (answer.equals("base-2")) {
                System.out.println("Please enter your number");
                int number = myInput.nextInt();
                System.out.println(binaryToDecimal(number));

            } else if (answer.equals("base-10")) {
                System.out.println("Please enter your number");
                int number = myInput.nextInt();
                System.out.println(decimalToBinary(number));
            } else {
                System.out.println("That is not an option.");
            }
            System.out.println("Would you like to try again? y/n");
            answerContinue = myInput.next();
        } while(answerContinue.equalsIgnoreCase("y"));
    }

    //convert to decimal
    private static long binaryToDecimal(){
        long decimal = 0;



    }
    //convert to binary
    private static String decimalToBinary(int number){

        String binary = "";

        do {
            binary = number % 2 + binary;
            number = number / 2;
        }while(number>0);
        return binary;
    }
}
