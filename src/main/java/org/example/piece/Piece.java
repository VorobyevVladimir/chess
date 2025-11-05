package org.example.piece;

import org.example.Coardinates;
import org.example.Color;

import java.util.Set;

abstract public class Piece {
    public final Color color;
    public Coardinates coardinates;

    public Piece(Color color, Coardinates coardinates) {
        this.color = color;
        this.coardinates = coardinates;
    }

    public  Set<Coardinates> getAvailableMoveSquares(){
        
    }

}
