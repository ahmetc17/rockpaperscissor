import java.util.Scanner;

public class rockpaperscissor {

    public static void main(String[] args) {
        int rock = 0;
        int paper = 1;
        int scissor = 2;
        int pp = 0;
        int cp =0;

    while (pp != 5 && cp !=5){

        int computer = (int)(Math.random()*3);

        Scanner scan = new Scanner(System.in);
        System.out.println("When you press the “1”, you will have selected the “rock”, press the “2”, you \n" +
                "will have selected the “paper” and press the “3”, you will have selected the \n" +
                "“scissor”");
        int player = scan.nextInt();

        if (computer == 0 && player == 0){
         System.out.println("Player:Rock  Computer:Rock Deuce");
        }
        if (computer == 0 && player == 1){
            System.out.println("Player:Paper  Computer:Rock Player won 1 point");
            pp = ++pp;  }
        if (computer == 0 && player == 2){
            System.out.println("Player:Scissor  Computer:Rock Computer won 1 point");
            cp = ++cp;  }
        if (computer == 1 && player == 0){
            System.out.println("Player:Rock  Computer:Paper Computer won 1 point");
            cp = ++cp;  }
        if (computer == 1 && player == 1){
            System.out.println("Player:Paper  Computer:Paper Deuce");
        }
        if (computer == 1 && player == 2){
            System.out.println("Player:Scissor  Computer:Paper Player won 1 point");
            pp = ++pp;  }
        if (computer == 2 && player == 0){
            System.out.println("Player:Rock  Computer:Scissor Player won 1 point");
            pp = ++pp;  }
        if (computer == 2 && player == 1){
            System.out.println("Player:Paper  Computer:Scissor Computer won 1 point");
            cp = ++cp;  }
        if (computer == 2 && player == 2){
            System.out.println("Player:Scissor  Computer:Scissor Deuce");
        }

        if (pp == 5) {
            System.out.println(" Player = " + pp + " Computer = " + cp + " Player won the game ");
        }
        if (cp == 5) {
            System.out.println("Player =" + pp + "Computer =" + cp + "Computer won the game");
        }
    }
    }
}
