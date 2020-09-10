package day17.task2;

public enum ChessPiece {
    KING_WHITE(100, "♔"), QUINN_WHITE(9, "♕"), ROOK_WHITE(5, "♖"), BISHOP_WHITE(3.5, "♗"),
    KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KING_BLACK(100, "♚"), QUINN_BLACK(9, "♛"), ROOK_BLACK(5, "♜"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");

    private double i;
    private String s;

    public double getI() {
        return i;
    }

    public String getS() {
        return s;
    }


    ChessPiece(double i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public String toString() {
        return getS();
    }
}
