package org.prog.session5;

public class Plane {
    public int maxSeats;
    public int passengers;

    public Plane() {
        maxSeats = 200;
    }

    public int getFreeSeatsPercentage() {
        int freeSeats = maxSeats - passengers;
        return (freeSeats * 100) / maxSeats;
    }
}