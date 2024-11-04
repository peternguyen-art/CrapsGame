import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int die1 = rnd.nextInt(6)+1;
        int die2 = rnd.nextInt(6)+1;
        int crapsRoll = die1 + die2;
        String userRes ="";

        do {
            System.out.println("Welcome to Craps Game");
            System.out.println("This is your first die: "+die1);
            System.out.println("This is your second die: "+die2);
            System.out.println("This is your sum: "+crapsRoll);
            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12 ){
                    System.out.println("Craps! You lost!");}
            else if (crapsRoll == 7 || crapsRoll == 11){
                System.out.println("Natural! You won!");
            }
            else {
                {
                    int point = crapsRoll;
                    System.out.println("This is your point: " + point);
                    boolean rolling = true;
                    while (rolling) {
                        die1= rnd.nextInt(6)+1;
                        die2 = rnd.nextInt(6)+1;
                        crapsRoll = die1 + die2;
                        System.out.println("Your rolls: " + die1 + " + " + die2 + " = " + crapsRoll);
                        if (crapsRoll == point) {
                            System.out.println("Made point! You won!");
                            rolling = false;
                        } else if (crapsRoll == 7) {
                            System.out.println("Rolled a 7. You lost!");
                            rolling = false;
                        } else {
                            System.out.println("Trying for point...");
                        }
                    }
                }
            }
            System.out.println("Do you want to play again? y/n");
            userRes = in.nextLine();
        } while (userRes.equalsIgnoreCase("y"));
    }
}