package org.example;

import java.util.HashMap;

public class Board {
    HashMap<Coardinates, Piece> pieces = new HashMap<>();

    public void setPiece(Piece piece, Coardinates coardinates){
        piece.coardinates =coardinates;
        pieces.put(coardinates, piece);
    }

    public void setupDefaultPiecesPositions(){

    }
}
