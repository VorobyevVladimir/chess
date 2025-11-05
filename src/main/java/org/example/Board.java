package org.example;

import org.example.piece.Pawn;
import org.example.piece.Rook;
import org.example.piece.Queen;
import org.example.piece.Knight;
import org.example.piece.King;
import org.example.piece.Bishop;
import org.example.piece.Piece;

import java.util.HashMap;

public class Board {
    HashMap<Coardinates, Piece> pieces = new HashMap<>();

    public void setPiece(Coardinates coardinates,Piece piece ){
        piece.coardinates =coardinates;
        pieces.put(coardinates, piece);
    }

    public boolean isSquareEmpty(Coardinates coardinates){
        return !pieces.containsKey(coardinates);
    }

    public Piece getPiece(Coardinates coardinates){
        return pieces.get(coardinates);
    }

    public void setupDefaultPiecesPositions(){
        for (File file : File.values()){
            setPiece(new Coardinates(file,2), new Pawn(Color.WHITE,new Coardinates(file,2)));
            setPiece(new Coardinates(file,7), new Pawn(Color.BlACK,new Coardinates(file,7)));
        }
        setPiece(new Coardinates(File.A ,1), new Rook(Color.WHITE,new Coardinates(File.A,1)));
        setPiece(new Coardinates(File.H,8), new Rook(Color.BlACK,new Coardinates(File.H,8)));
        setPiece(new Coardinates(File.H ,1), new Rook(Color.WHITE,new Coardinates(File.H,1)));
        setPiece(new Coardinates(File.A,8), new Rook(Color.BlACK,new Coardinates(File.A,8)));

        setPiece(new Coardinates(File.B ,1), new Knight(Color.WHITE,new Coardinates(File.B,1)));
        setPiece(new Coardinates(File.B,8), new Knight(Color.BlACK,new Coardinates(File.B,8)));
        setPiece(new Coardinates(File.G ,1), new Knight(Color.WHITE,new Coardinates(File.G,1)));
        setPiece(new Coardinates(File.G,8), new Knight(Color.BlACK,new Coardinates(File.G,8)));

        setPiece(new Coardinates(File.F ,1), new Bishop(Color.WHITE,new Coardinates(File.B,1)));
        setPiece(new Coardinates(File.F,8), new Bishop(Color.BlACK,new Coardinates(File.B,8)));
        setPiece(new Coardinates(File.C ,1), new Bishop(Color.WHITE,new Coardinates(File.G,1)));
        setPiece(new Coardinates(File.C,8), new Bishop(Color.BlACK,new Coardinates(File.G,8)));

        setPiece(new Coardinates(File.D ,1), new Queen(Color.WHITE,new Coardinates(File.D,1)));
        setPiece(new Coardinates(File.D ,8), new Queen(Color.BlACK,new Coardinates(File.D,8)));

        setPiece(new Coardinates(File.E ,1), new King(Color.WHITE,new Coardinates(File.E,1)));
        setPiece(new Coardinates(File.E ,8), new King(Color.BlACK,new Coardinates(File.E,8)));
    }

    public static boolean isSquareDark(Coardinates coardinates){
        return(((coardinates.file.ordinal() + 1) + coardinates.rank) % 2) == 0;
    }
}
