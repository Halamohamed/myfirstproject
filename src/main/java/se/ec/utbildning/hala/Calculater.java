package se.ec.utbildning.hala;


import java.util.Scanner;

public class Calculater {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){

        boolean calcu = true;
        println("calculater");
        while (calcu) {
           printMenu();
            int select = scanner.nextInt();
            println("Enter the first number you want to calculate");
            double number1 = scanner.nextDouble();
            println("Enter the second number");
            double number2 = scanner.nextDouble();
            switch (select) {
                case 1:
                   System.out.println(addition(number1, number2));
                    break;
                case 2:
                    System.out.println(subtraction(number1, number2));
                    break;
                case 3:
                    System.out.println(multiplication(number1, number2));
                    break;
                case 4:
                    System.out.println(division(number1, number2));
                    break;
                default:
                    System.out.println("you have entered wrong number");

            }

            println("do you want to calculate more (yes/no)");

            String answer = scanner.next();
            if(answer.equalsIgnoreCase("NO") )
                calcu = false;
            else
                calcu = true;
        }

    }


    private static void printMenu() {
        println("select the operation you want");
        println("1. + ");
        println("2. - ");
        println("3. * ");
        println("4. / ");
    }

    public static double division(double number1, double number2) {
        double result = number1 / number2;
        return result;
    }

    public static double multiplication(double number1, double number2) {
        double result = number1 * number2;
        return result;
    }

    private static void println(String string) {
        System.out.println(string);
    }

    public static double addition(double number1, double number2){
        double result = number1 + number2;
        return result;
    }

    public static double subtraction(double number1, double number2){
        double result = number1 - number2;
        return result;
    }
}
