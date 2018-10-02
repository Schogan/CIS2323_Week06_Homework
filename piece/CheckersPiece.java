package piece;

public class CheckersPiece{
	private int posX;
	private int posY;
	private char posYChar;
	private char tile;
	
	private redCheckers[][] red = new redCheckers[8][8];
	private blackCheckers[][] black = new blackCheckers[8][8];
	
	public void CheckersPiece(){
		redCheckers();
		blackCheckers();
	}
	
	public void redCheckers(){
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				redCheckers[i][j] = new red();
				redCheckers[i][j].makeBoard(i, j);
								
			}
		}
	}
	
	public void blackCheckers(){
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				blackCheckers[i][j] = new black();
				blackCheckers[i][j].makeBoard(i, j);
								
			}
		}
	}
	
	public void makeBoard(int a, int b){
		if(a == 3 || a == 4){
		
		}else{
		setColor(a);
		setPosition(a,b);
		setTile(a,b);
		}
	}
	
	public void setColor(int a){
		if (a==0||a==1||a==2){
			color = "red"
		}
		if (a==5||a==6||a==7){
			color = "black"
		}
	}
	
	public void setTile(int a, int b){
		tile = 'X';
	}

		
	
		
	public void setPosition(int x, int y){
		posX = x+1;
		posY = y+1;
		
		
		if (posY == 1){
			posYChar = 'A';
		}
		if (posY == 2){
			posYChar = 'B';
		}
		if (posY == 3){
			posYChar = 'C';
		}
		if (posY == 4){
			posYChar = 'D';
		}
		if (posY == 5){
			posYChar = 'E';
		}
		if (posY == 6){
			posYChar = 'F';
		}
		if (posY == 7){
			posYChar = 'G';
		}
		if (posY == 8){
			posYChar = 'H';
		}
		
		
	}
	
}