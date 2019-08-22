package se.ec.utbildning.hala;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int secretNumber=10;
        int maxGusses= 5;
        boolean keepAlive = true;
        while(keepAlive){
            System.out.println("1. play the game");
            System.out.println("2. Quit");
            System.out.println("please make a choice:");
            String choice = scanner.nextLine();
            if(choice.equals("1")){
                String outCome = playGame(secretNumber,maxGusses);
                System.out.println(outCome);

            }else if (choice.equals("2")){
                keepAlive=false;
            }else
                System.out.println("unrecognized input");
        }

    }
    private static String playGame(int secretNumber, int maxGuesses){
        String outCome= "you lose";
        for(int guessNumber = 0; guessNumber <= maxGuesses ; guessNumber++){
            System.out.println("guess "+ guessNumber+" of "+ maxGuesses);
            String numberInput = scanner.nextLine();
            int guess = Integer.parseInt(numberInput);


        }
        return outCome;
    }
}
