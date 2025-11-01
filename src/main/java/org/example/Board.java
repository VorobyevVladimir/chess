package org.example;

import org.example.piece.Pawn;
import org.example.piece.Piece;

import java.util.HashMap;

public class Board {
    HashMap<Coardinates, Piece> pieces = new HashMap<>();

    public void setPiece(Coardinates coardinates,Piece piece ){
        piece.coardinates =coardinates;
        pieces.put(coardinates, piece);
    }

    public void setupDefaultPiecesPositions(){
        for (File file : File.values()){
            setPiece(new Coardinates(file,2), new Pawn(Color.WHITE,new Coardinates(file,2)));
            setPiece(new Coardinates(file,7), new Pawn(Color.BlACK,new Coardinates(file,7)));
        }
    }

    public static boolean isSquareDark(Coardinates coardinates){
        return(((coardinates.file.ordinal() + 1) + coardinates.rank) % 2) == 0;
    }
}
