package game;
import piece.*;
import board.*;

public class Game{
	/* private char currentGame[][] = new char[8][8];
	
	private char tile;
	private char newTile;
	
	private Board board = new Board();
	private CheckersPiece piece = new CheckersPiece();
		
	public void Game(){
		setupGame();
		updateBoard();
	}
	
	public void setupGame(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				piece.setCord(i,j);
				newTile = piece.requestTile();
					if(newTile=='R'||newTile=='B'){
						currentGame[i][j]=newTile;
					}else{
						currentGame[i][j]='X';
					}
				/* if (currentGame[i][j]!='r'||currentGame[i][j]!='b'){
					currentGame[i][j]=board.requestTile(i,j);} 
				
			}
		}
	}
	
	public void updateBoard(){
		for(int i=0;i<8;i++){
			System.out.print("|");
			for(int j=0;j<8;j++){
				System.out.print(currentGame[i][j]);
			}
			System.out.print("|\n");
			System.out.println("--------------------------");
		}
	}
	
	public void playerMove(){
		
	}
	
	public String printInfo(){
		return " " + tile + " ";
				
	} */
	
}