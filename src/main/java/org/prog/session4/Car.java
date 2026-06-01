package org.prog.session4;

public class Car {
    //поле класса
    public String color;
    public int maxSpeed;
    public String owner;

    //метод класса
    public void goTo(int distance, String destination) {
        System.out.println(color + " car starts engine");
        System.out.println(color + " car belonging to " + owner + " goes to " + destination);
        System.out.println(color + " the car is on its way to the destination. ");
        System.out.println(color + " car arrived at destination.");
        if (maxSpeed > distance) {
            System.out.println("Cannot calculate time - Nikita is too fast!");
        } else {
            System.out.println("Car will arrive in: " + distance / maxSpeed);
        }
    }
}
