package day17.task1;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        int x;
        ChessPiece[] chessPieces = new ChessPiece[8];
        for (x = 0; x < 4; x++) {
            chessPieces[x] = pawnWhite;
        }
        for (x = 4; x < 8; x++) {
            chessPieces[x] = rookBlack;
        }
        for (ChessPiece i : chessPieces) {
            System.out.print(i + " ");
        }
    }
}
