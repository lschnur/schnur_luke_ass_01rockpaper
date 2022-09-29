import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String player1=" ";
        String player2=" ";


        System.out.println("Player 1 enter your move [R,P,S]");
        player1=in.nextLine();
        System.out.println("Player 2 enter your first move [R,P,S] ");
        player2=in.nextLine();

        if (player1 == player2)
        {
            System.out.println("Both players had the same move you tie");
        }



        if(player1.equals("R"))
        {
            if (player2.equalsIgnoreCase("P"))
            {
                System.out.println("Player 2 wins");
            }
            if (player2.equalsIgnoreCase("S"))
            {
                System.out.println("Player 1 wins");
            }
        }
        if(player1.equals("P"))
        {
            if (player2.equalsIgnoreCase("R"))
            {
                System.out.println("Player 1 wins");
            }
            if (player2.equalsIgnoreCase("S"))
            {
                System.out.println("Player 2 wins");
            }
        }
        if(player1.equals("S"))
        {
            if (player2.equalsIgnoreCase("P"))
            {
                System.out.println("Player 1 wins");
            }
            if (player2.equalsIgnoreCase("R"))
            {
                System.out.println("Player 2 wins");
            }
        }
        else
        {
            System.out.println("You have entered an invalid input");
        }

        System.out.println("Do you want to play again [Y,N]" );
        in.nextLine();
    }

}