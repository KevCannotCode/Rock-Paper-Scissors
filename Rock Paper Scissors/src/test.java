import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class test extends TestCase {
	String [] handTest = {"rock", "paper", "scissors"};
	Game game = new Game();
	public void setUp() {
	}
	@Test
	void test01() {
		//testing the game class 

		String shootText = game.shoot(3);//this means the player should have scissors
		boolean goodShoot = false;

		if(shootText.contains("You have scissors"))
			if(shootText.contains("Cpu has rock") || shootText.contains("Cpu has paper") || shootText.contains("Cpu has scissors"))
				goodShoot = true;
		assertTrue(goodShoot);
	}
@Test
	void test02() {
		//testing the results 

		game.result("rock","scissors");
		assertEquals(game.getWin(), 1);
		assertEquals(game.getLoss(), 0);

		game.result("rock","paper");
		assertEquals(game.getWin(), 1);
		assertEquals(game.getLoss(), 1);

		game.result("scissors","scissors");
		assertEquals(game.getWin(), 1);
		assertEquals(game.getLoss(), 1);
		
		game.result("scissors","paper");
		assertFalse(game.getWin()!= 2);
		assertFalse(game.getLoss()!= 1);
		
	}

@Test
void test03() {
	Driver drive = new Driver();
	
}



}
