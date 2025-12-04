package com.learncenter.design.pattern.factory;

import com.learncenter.design.pattern.turtles.Turtle;

public class StubbornTurtleFactory implements TurtleFactory {

    @Override
    public Turtle createNormalTurtle() {

        int head = 2;
        int legs = 4;
        String home = "carapace";

        Turtle turtle = new Turtle();
        turtle.setHeadLength(5 - head);
        turtle.setNumberOfLegs(legs * 4);
        turtle.setHome(home);

        return turtle;
    }

    @Override
    public Turtle createWeirdTurtle() {

        int head = 0;
        int legs = 1;
        String home = "mexico";

        Turtle turtle = new Turtle();
        turtle.setHeadLength(5 - head);
        turtle.setNumberOfLegs(legs * 4);
        turtle.setHome(home);

        return turtle;
    }
}
