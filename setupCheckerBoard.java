import board.*;
import piece.*;
import java.util.Scanner;
public class setupCheckerBoard{
	public static void main(String[] args){
		//final int COUNT = 64;
		
		//Board[][] Pieces  = new Board[8][8];
		
		char choice = 'a';
		
		Scanner inputDevice = new Scanner(System.in);
		
		/*System.out.println("Would you like to make a new chess board? \n");
		choice = inputDevice.next().charAt(0);
		inputDevice.nextLine();*/
		
		
		boolean cont = true;
		Board board = new Board();
		
		
		while(cont){
			System.out.println("=================================== \n");
			System.out.println("What would you like to do? \n");
			System.out.println("y) Make a new chess board? \n");
			System.out.println("p) Print board \n");
			System.out.println("q) Quit game \n");
			//System.out.println("d) Print count of ToDo \n");
			System.out.println("=================================== \n");
			
			choice = inputDevice.next().charAt(0);
			inputDevice.nextLine();
			
			if(choice=='y'){
				//Board board = new Board();
				board.Board();
			}
			if(choice=='p'){
				board.printBoard();
			}
			if(choice=='q'){
				cont=false;
			}
		}
		/*int countA=0;
		int countB=0;
		String type = "holder";
		int posX=0;
		int posY=0;
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i==1 || i==6){
					type = "pawn";
				}
				if((i==0 || i==7) && (j==0||j==7)){
					type = "rook";
				}
				if((i==0 || i==7) && (j==1||j==6)){
					type = "knight";
				}
				if((i==0 || i==7) && (j==2||j==5)){
					type = "bishop";
				}
				if((i==0 || i==7) && j==3){
					type = "queen";
				}
				if((i==0 || i==7) && j==4){
					type = "king";
				}
				
				Pieces[i][j] = new Board();
				Pieces[i][j].Board(type, i, j);
					
			}
		}
	
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.println(Board.Pieces[i][j].printInfo());
			}
		}*/
				
	}	
}