import java.util.Random;

public class Game {
	private String  player;
	private String cpu;
	private int win;
	private int loss;
	private String [] hands = {"rock", "paper", "scissors"};

	public Game() {
		player = "";
		cpu = "";
		win = 0;
		loss = 0;
	}

	public String shoot(int choice) {
		// gives a hand to cpu
		Random rand = new Random();
		cpu = hands[rand.nextInt(3)];
		player = hands[choice];

		return "Cpu has "+ cpu + " and You have "+player;
	}

	public void result(String player, String cpu) {
		if(player.equals(cpu)) {
			System.out.println("It's a tie");return;}

		else if(player.equals("rock")) {
			if(cpu.equals("scissors")) {
				System.out.println("You won");
				win++;}
			else {
				System.out.println("You lost");
				loss++;}
		}

		else if(player.equals("paper")) {
			if(cpu.equals("rock")) {
				System.out.println("You won");
				win++;}
			else {
				System.out.println("You lost");
				loss++;}
		}

		else if(player.equals("scissors")) {
			if(cpu.equals("paper")) {
				System.out.println("You won");
				win++;}
			else {
				System.out.println("You lost");
				loss++;}
		}
		
		System.out.println("Win : "+ win+"\nLoss: "+ loss);

	}
	
	public void finalResult() {
		System.out.println("you won "+ win+" times and lost "+ loss +" times Bye!");
	}

	public int getWin(){
		return win;
	}

	public int getLoss() {
		return loss;
	}
	
	public String getPlayer() {
		return player;
	}
	public String getCpu() {
		return cpu;
	}
}
