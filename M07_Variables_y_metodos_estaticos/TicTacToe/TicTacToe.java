package games;

import java.util.Scanner;

public class TicTacToe {
	
	private static final char player1Symbol = 'X';
	private static final char player2Symbol = 'O';	
	private static final char EMPTY_SPACE = '_';
	
	private char[][] board;
	private String player1;
	private String player2;
	private boolean gameFinished;
	private int turn;
	
	
	public TicTacToe(String player1, String player2) {
		this.turn = 0; //0, 1
		this.initializeBoard();
		this.player1 = player1;
		this.player2 = player2;
		this.gameFinished = false;
	}
	
	private void initializeBoard() {
		
		this.board = new char[3][3];
		
		for(int r=0; r<this.board.length; r++) {
			for(int c=0; c<this.board[r].length; c++) {
				this.board[r][c] =EMPTY_SPACE;
			}
		}
		
	}

	public void play() {
		
		
		//1. Pedirle al jugador en turno que ingrese unas coordenadas
		//2. Agregar la coordenada al tablero
		//3. Verificar si hay un ganador
		//4. Repetir desde paso #1
		
		Scanner keyboard = new Scanner(System.in);
		
		while(this.boardWinner() == EMPTY_SPACE) {
			
			int row;
			int col;
			
			do {
				this.printBoard();
				System.out.println();
				System.out.println("Es el turno de "+  this.getPlayerInTurnName() + ".");
				System.out.print("Ingresa una fila: ");
				row = keyboard.nextInt();
				
				System.out.print("Ingresa una columna: ");
				col = keyboard.nextInt();
				
			} while(!this.addSymbolToBoard(this.turn, row, col));	
			
			if (this.boardWinner() != EMPTY_SPACE) {
				System.out.println("Felicidades! Tenemos un ganador");
			}
			
		}
		
		keyboard.close();
		
	}
	
	private String getPlayerInTurnName() {
		if (this.turn == 0) {
			return this.player1;
		} else {
			return this.player2;
		}
	
	}

	private void printBoard() {
		for(char[] row: board) {
			for(char element: row) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

	private boolean addSymbolToBoard(int turn, int row, int col) {
		
		char symbol;
		if(turn == 0) {
			symbol = TicTacToe.player1Symbol;
		} else {
			symbol = TicTacToe.player2Symbol;
		}
		
		//falta validar si row y column son validas
		
		if (this.board[row][col] == EMPTY_SPACE) {
			this.board[row][col] = symbol;
			this.turn = (this.turn + 1) % 2;
			return true;
		}
		
		return false;
	
	}
	
	private char boardWinner() {
		
		char winner = EMPTY_SPACE;
		winner = boardHasHorizontalWinner();
		if (winner != EMPTY_SPACE ) {
			return winner;
		}
		
		winner = boardHasVerticalWinner();
		if (winner != EMPTY_SPACE) {
			return winner;
		}
		
		winner = boardHasDiagonalWinner();
		if (winner != EMPTY_SPACE) {
			return winner;
		}		
		
		return winner;
	}
	
	
	private char boardHasDiagonalWinner() {
		if (this.board[0][0] == this.board[1][1] && 
			this.board[1][1] == this.board[2][2] &&
			this.board[0][2] != EMPTY_SPACE) {
			return this.board[0][0];
		}
		
		if (this.board[0][2] == this.board[1][1] && 
			this.board[1][1] == this.board[2][0] &&
			this.board[0][2] != EMPTY_SPACE) {
				return this.board[0][2];
		}		
		
		return EMPTY_SPACE;	
	}

	private char boardHasVerticalWinner() {
		
		for(int c=0; c<board[0].length; c++) {
			if (this.board[0][c] == this.board[1][c] && 
				this.board[1][c] == this.board[2][c] &&
				this.board[0][c] != EMPTY_SPACE) {
				return this.board[0][c];
			}			
		}
		
		return EMPTY_SPACE;	
	}


	private char boardHasHorizontalWinner() {	
		for(int r=0; r<board.length; r++) {
			if (this.board[r][0] == this.board[r][1] && 
				this.board[r][1] == this.board[r][2] &&
				this.board[r][0] != EMPTY_SPACE) {
				return this.board[r][0];
			}			
		}
		return EMPTY_SPACE;
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}	
	
}
