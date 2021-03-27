import java.util.Scanner;
public class Driver {

	public static void main (String [] arg) {
		int choice = 0;
		String [] hands = {"rock", "paper", "scissors"};
		Scanner scan = new Scanner (System.in);
		int start = 0;
		//welcome and start
		System.out.println("WELCOME TO ROCK--PAPER--SCISSORS--\nFor those who don't know the rules, well too bad I'm not gonna explain the rules\nPress 1 to start");
		start = scan.nextInt();
		while(start != 1){
			System.out.println("please press 1");
			start = scan.nextInt();
		}
		//game starts 
		Game game = new Game();
		do {
			//player picks a hand
			do {
			System.out.println("Please type 0->rock 1->paper 2->scissors");
			choice = scan.nextInt();
			}while(choice!=0 && choice!=1 && choice!=2);
			//the delay for rock paper scissors shoot
			//arg come from the driver (main method)
			synchronized (arg) {
				try {
					System.out.println("Rock");
					arg.wait(400);//the variables in the main method are halted for 400 milliseconds
					System.out.println("Paper");
					arg.wait(400); 
					System.out.println("Scissors");
					arg.wait(400); 
					System.out.println("Shoot!!!!!!! \n");
					arg.wait(800);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(game.shoot(choice));
			game.result(game.getPlayer(),game.getCpu());
			//ask for replay	
			System.out.println("Do you want to play again? 2-> yes 3->no");
			start = scan.nextInt();
			while(start!=2 && start != 3) {
				System.out.println("please press 2->yes or 3->no");
				start = scan.nextInt();}
		}while(start != 3);
		//final result
		game.finalResult();
	scan.close();
	}
}
