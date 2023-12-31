package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	public Piece() {}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	public abstract Piece[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return true;
	}
	
	public boolean isThereAnyPossibleMove() {
		return true;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	protected Board getBoard() {
		return board;
	}
}
