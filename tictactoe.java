/* Checks if a player has won at tictactoe for an NxN board and M players
   Input board is an NxN integer array,
   where 0 represents no move has taken place, and any integer > 0 identifies the player */
class tictactoe {
	
	static boolean checkRow(int[][] board, int playerid, int row_no) {
		int playercount = 0;
		for (int i = 0; i < board.length; i ++) {
			if (board[row_no][i] == playerid)
				playercount ++;
		}
		if (playercount == board.length)
			return true;
		return false;
	}
	
	static boolean checkCol(int[][] board, int playerid, int row_no) {
		int playercount = 0;
		for (int i = 0; i < board.length; i ++) {
			if (board[i][row_no] == playerid)
				playercount ++;
		}
		if (playercount == board.length)
			return true;
		return false;
	}
	
	static boolean checkDiags(int[][] board, int playerid) {
		int playercount = 0;
		for (int i = 0; i < board.length; i ++) {
			if (board[i][i] == playerid)
				playercount ++;
		}
		if (playercount == board.length)
				return true;
		playercount = 0;
		for (int i = board.length-1; i == 0; i --) {
			if (board[i][i] == playerid)
				playercount ++;
		}
		if (playercount == board.length)
				return true;
		return false;
		
	}
	
	static boolean winCheck(int[][] board, int playerid) {
		for (int i = 0; i < board.length; i++) {
			if (checkRow(board, playerid, i))
				return true;
			if (checkCol(board, playerid, i))
				return true;
		}
		if (checkDiags(board, playerid))
			return true;
		return false;
	}
	
	public static void main(String args[]) {
		int[][] board = new int[][] {{2,2,2,2}, 
									 {2,1,2,1}, 
									 {2,2,2,1},
									 {1,2,1,1}};
		System.out.println(winCheck(board, 1));
		System.out.println(winCheck(board, 2));
	}
}