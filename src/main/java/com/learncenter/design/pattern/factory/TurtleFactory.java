package com.learncenter.design.pattern.factory;

import com.learncenter.design.pattern.turtles.Turtle;

public interface TurtleFactory {

    Turtle createNormalTurtle();

    Turtle createWeirdTurtle();
}