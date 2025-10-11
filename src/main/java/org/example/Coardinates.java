package org.example;

import java.util.Objects;

public class Coardinates {
    public final File file;
    public final Integer rank;

    public Coardinates(File file, Integer rank) {
        this.file = file;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coardinates that = (Coardinates) o;
        return file == that.file && Objects.equals(rank, that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }
}
