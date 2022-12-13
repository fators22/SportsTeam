import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SportsTest {
	SportsTeam obj;

	@DisplayName("calling constructor")
	@Test 
	void Should_call_Constructor () {
		String expects="Bergen";
		 obj= new SportsTeam("Bergen");
		String  received= expects.getName();
		assertEquals(expects, received);
		assertEquals(0, m.getPlay());
	}

	@DisplayName("get Win Percentage") 
	@Test 
	void Should_ReturnWin() {
		obj=new SportsTeam("Bergen", 7, 3, 4, 0);
		int count = obj.getWins();
		assertEquals(3, count);
	}

	@DisplayName("get Win +1 Percentage") 
	@Test 
	void Should_ReturnWin1() {
		obj=new SportsTeam("Bergen", 7, 3, 4, 0);
	
		obj.playGame("W");
		int count = obj.getWins();
		assertEquals(4, count);
	}

	@DisplayName("get Loss +1 Percentage") 
	@Test 
	void Should_ReturnLoss() {
		obj=new SportsTeam("Bergen", 7, 3, 4, 0);
	
		obj.playGame("L");
		int count = obj.getLoss();
		assertEquals(5, count);
	}
	
	@DisplayName("To String Method") 
	@Test 
	void Should_ReturntoString() {
		obj=new SportsTeam("Bergen", 7, 3, 4, 0);
	        String received= obj.toString();
		String expected= "Knights: 3 Wins, 4 Losses, 0 Ties, 3 Touchdowns, 1 Interceptions";
		assertEquals(expected, received);
	}

}
