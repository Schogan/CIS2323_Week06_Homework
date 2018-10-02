package piece;

public class CheckersPiece{
	private int posX;
	private int posY;
	private String color;
	private int nPieceRed;
	private int nPieceBlack;
	private char posYChar;
	private char tile;
	
	private CheckersPiece[][] red = new CheckersPiece[8][8];
	private CheckersPiece[][] black = new CheckersPiece[8][8];
	
	public void CheckersPiece(){
		redCheckers();
		blackCheckers();
	}
	
	public void redCheckers(){
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				red[i][j] = new CheckersPiece();
				red[i][j].makeRed(i, j);
								
			}
		}
	}
	
	public void blackCheckers(){
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				black[i][j] = new CheckersPiece();
				black[i][j].makeBlack(i, j);
								
			}
		}
	}
	
	public void makeRed(int a, int b){
		int nPieceRed = b+1;
		if(a==5&&b%2==0||a==6&&b%2!=0||a==7&&b%2==0){
			color = "red";
			setPosition(a,b);
			tile = 'R';
		}else{
			tile = 'x';
		}
	}
	
	public void makeBlack(int a, int b){
		int nPieceBlack = b+1;
		if(a==0&&b%2!=0||a==1&&b%2==0||a==2&&b%2!=0){
			color = "black";
			setPosition(a,b);
			tile = 'B';
		}else{
			tile = 'x';
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
	
	public void printRed(){
		for(int i=0;i<8;i++){
			System.out.print("|");
			for(int j=0;j<8;j++){
				System.out.print(red[i][j].printInfo());
			}
			System.out.print("|\n");
			System.out.println("--------------------------");
		}
		
	}
	public void printBlack(){
		for(int i=0;i<8;i++){
			System.out.print("|");
			for(int j=0;j<8;j++){
				System.out.print(black[i][j].printInfo());
			}
			System.out.print("|\n");
			System.out.println("--------------------------");
		}
		
	}
	
	public String printInfo(){
		return " " + tile + " ";
				
	}
	
}