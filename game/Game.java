package game;
import piece.*;
import board.*;

public class Game{
	private Game[][] currentGame = new Game[8][8];
	
	private char tile;
	
	public void Game(){
		
	}
	
	public void updateBoard(){
		for(int i=0;i<8;i++){
			System.out.print("|");
			for(int j=0;j<8;j++){
				System.out.print(currentGame[i][j].printInfo());
			}
			System.out.print("|\n");
			System.out.println("--------------------------");
		}
	}
	
	public void playerMove(){
		
	}
	
	public String printInfo(){
		return " " + tile + " ";
				
	}
	
}