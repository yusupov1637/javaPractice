
public class TicTacToe {

	public static void main(String[] args) {
	char [] [] gameBoard = {{' ' , '|' , ' ', '|' ,' '},
				{'-' , '+' , '-', '+' ,'-'},
				{' ' , '|' , ' ', '|' ,' '},
				{'-' , '+' , '-', '+' ,'-'},
				{' ' , '|' , ' ', '|' ,' '}
				};
          for(char[] row : gameBoard) {
        	  for(char c :row) {
        		  System.out.println(c);
        	  }

          }
	}
}

