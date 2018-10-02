package piece;

public class CheckersPiece{
	private int posX;
	private int posY;
	private int nPieceRed;
	private int nPieceBlack;
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
				redCheckers[i][j].makeRed(i, j);
								
			}
		}
	}
	
	public void blackCheckers(){
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				blackCheckers[i][j] = new black();
				blackCheckers[i][j].makeBlack(i, j);
								
			}
		}
	}
	
	public void makeRed(int a, int b){
		int nPieceRed = b+1;
		if(a==0&&b%2!=0||a==1&&b%2==0||a==2&&b%2!=0){
			color = "red";
			setPosition(a,b);
			tile = 'R';
		}else{
		
		}
	}
	
	public void makeBlack(int a, int b){
		int nPieceBlack = b+1;
		if(a==5&&b%2==0||a==6&&b%2!=0||a==7&&b%2==0){
			color = "black";
			setPosition(a,b);
			tile = 'B';
		}else{
		
		}
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