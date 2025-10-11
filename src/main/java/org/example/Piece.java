package org.example;

abstract public class Piece {
    public final Color color;
    public Coardinates coardinates;

    public Piece(Color color, Coardinates coardinates) {
        this.color = color;
        this.coardinates = coardinates;
    }
}
