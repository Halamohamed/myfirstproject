package se.ec.utbildning.hala;


import java.util.Scanner;

public class Calculater {
    private String number1;
    private String number2;
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        String string1=null;
        String string2=null;
        double result=0;
        Calculater calculater = new Calculater();
        println("calaulater");
        println("select the operator you want");
        println("1. + ");
        println("2. -");
        String choice = scanner.nextLine();

        switch (choice){
            case "+":
                result= calculater.addition(string1,string2);
                break;
            case "-":
                result= calculater.substraction(string1,string2);
                break;
            default:
                System.out.println("you have entered wrong operator");

        }
        System.out.println(result);

    }

    private static void println(String string) {
        System.out.println(string);
    }

    public double addition(String s1, String s2){
        println("Enter the number you want to add");
        s1 = scanner.nextLine();
        println("Enter the other number");
        s2 = scanner.nextLine();
        double st1= Double.parseDouble(s1);
        double st2 = Double.parseDouble(s2);
        return st1+st2;
    }

    public double substraction(String s1, String s2){
        println("Enter the number you want to subtract");
        s1 = scanner.nextLine();
        println("Enter the other number");
        s2 = scanner.nextLine();
        double st1= Double.parseDouble(s1);
        double st2 = Double.parseDouble(s2);
        return st1-st2;
    }
}
