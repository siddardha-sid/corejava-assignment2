import java.util.Scanner;

class Guesser{
	int guessed_number;
	Scanner scan=new Scanner(System.in);
	int guessing() {
		System.out.println("please guesser guess the number between 1-100 range");
		guessed_number=scan.nextInt();
		return guessed_number;
	}
}
class Players extends Guesser {
	int player1,player2, player3;
	int Player_guessing_number;
	 int playerGuessing() {
		System.out.println("please player guess the number between 1-100 range");
		Player_guessing_number=scan.nextInt();
		if(Player_guessing_number<=0 && Player_guessing_number>100 ) {
			return -1;
		}
		return Player_guessing_number;
	}
}
class Umpire extends Guesser{
	int numFromGuesser=guessing();
	int numFromplayer1,numFromplayer2,numFromplayer3;
	void GuessingPlayersNum() {
		
			Players p1=new Players();
			Players p2=new Players();
			Players p3=new Players();
			numFromplayer1=p1.playerGuessing();
			numFromplayer2=p2.playerGuessing();
			numFromplayer3=p3.playerGuessing();
			System.out.println(numFromGuesser);
		}
		
	
	void compare() {
		if(numFromGuesser>0 && numFromGuesser<=100 )
		{
			if(numFromplayer1>0 && numFromplayer1<=100 && numFromplayer2>0 && numFromplayer2<=100
					&& numFromplayer3>0 && numFromplayer3<=100) {
				if(numFromplayer1==numFromGuesser) {
					System.out.println("player 1 has guessed");
				} if(numFromplayer2==numFromGuesser) {
					System.out.println("player 2 has guessed");
				} if(numFromplayer3==numFromGuesser) {
					System.out.println("player 3 has guessed");
				}else {
					System.out.println("no one guessed the number");
				}
			}else {
				System.out.println("players guessed numbers are not within range");
			}
			
		}else {
			System.out.println("the guessed number should be in the range of 1-100,the guessed number is "+numFromGuesser);
		}
			
		
			
		
	}
}

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Guesser g=new Guesser();
//g.guessing();
Umpire u=new Umpire();
u.GuessingPlayersNum();
u.compare();
	}

}
