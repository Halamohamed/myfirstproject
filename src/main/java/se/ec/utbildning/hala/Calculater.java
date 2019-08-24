package se.ec.utbildning.hala;


import java.util.Scanner;

public class Calculater {
    private String number1;
    private String number2;
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        String string1=null;
        String string2=null;
        boolean calcu = true;
        double result=0;
        Calculater calculater = new Calculater();
        println("calaulater");
        while (calcu) {
            println("select the operator you want");
            println("1. + ");
            println("2. - ");
            println("3. * ");
            println("4. / ");
            String choice = scanner.nextLine();
            int select = Integer.parseInt(choice);

            switch (select) {
                case 1:
                    result = calculater.addition(string1, string2);
                    break;
                case 2:
                    result = calculater.substraction(string1, string2);
                    break;
                case 3:
                    result = calculater.multiplication(string1, string2);
                    break;
                case 4:
                    result = calculater.division(string1, string2);
                    break;
                default:
                    System.out.println("you have entered wrong operator");

            }
            System.out.println(result);
            println("do you want to calculate more (yes/no)");
            String answer = scanner.nextLine();
            if(answer.equals("NO") || answer.equals("no"))
                calcu = false;
            else
                calcu = true;
        }

    }

    private double division(String number1, String number2) {
        println("Enter the first number you want to divide");
        number1 = scanner.nextLine();
        println("Enter the second number");
        number2 = scanner.nextLine();
        double st1= Double.parseDouble(number1);
        double st2 = Double.parseDouble(number2);
        return st1/st2;
    }

    private double multiplication(String number1, String number2) {
        println("Enter the first number you want to multiply");
        number1 = scanner.nextLine();
        println("Enter the second number");
        number2 = scanner.nextLine();
        double st1= Double.parseDouble(number1);
        double st2 = Double.parseDouble(number2);
        return st1*st2;
    }

    private static void println(String string) {
        System.out.println(string);
    }

    public double addition(String number1, String number2){
        println("Enter the first number you want to add");
        number1 = scanner.nextLine();
        println("Enter the second number");
        number2 = scanner.nextLine();
        double st1= Double.parseDouble(number1);
        double st2 = Double.parseDouble(number2);
        return st1+st2;
    }

    public double substraction(String number1, String number2){
        println("Enter the first number you want to subtract");
        number1 = scanner.nextLine();
        println("Enter the second number");
        number2 = scanner.nextLine();
        double no1= Double.parseDouble(number1);
        double no2 = Double.parseDouble(number2);
        return no1-no2;
    }
}
