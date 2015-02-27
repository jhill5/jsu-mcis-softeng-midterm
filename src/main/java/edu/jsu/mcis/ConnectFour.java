package edu.jsu.mcis;

public class ConnectFour {
    public enum Location {EMPTY, RED, BLACK};
	public enum Result { RED_WIN, BLACK_WIN, NONE, TIE }
	private int COULUMNS = 7;
	private int ROWS = 6;
	private Token [][] board;
	private boolean redTurn;
    
    public ConnectFour() {
		board = new Location[ROWS][COLUMNS];
		for( int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = Location.EMPTY;
			}
		}
        redTurn = true; 
    }
    
    public Location getTopOfColumn(int column) {
		
		return Location.EMPTY;

    }
    
    public int getHeightOfColumn(int column) {
		return 0;
        
    }
    
    public void dropToken(int column) {
		return true;
        
    }
	public Result getResult() {
		return result.TIE;
	}
	
	private boolean RedWinVerticallyInColumn(int col) {
        String columnString = makeStringFromColumn(col);
        return (columnString.indexOf("RRRR") >= 0);
}