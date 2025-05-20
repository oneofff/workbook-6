package com.pluralsight.forms;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        World world = new World(300, 300);
        Turtle turtle = new Turtle(world, -50, 25);

        turtle.setPenWidth(3);
        turtle.setColor(Color.BLUE);


        int sideLength = 100;


        turtle.forward(sideLength);


        turtle.turnLeft(120);
        turtle.forward(sideLength);

        turtle.turnLeft(120);
        turtle.forward(sideLength);


        turtle.turnLeft(120);


        turtle.penUp();
        turtle.goTo(world.getWidth(), world.getHeight());
    }
}