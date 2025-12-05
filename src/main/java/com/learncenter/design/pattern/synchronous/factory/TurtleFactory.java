package com.learncenter.design.pattern.synchronous.factory;

import com.learncenter.design.pattern.turtles.Turtle;

public interface TurtleFactory {

    Turtle createNormalTurtle();

    Turtle createWeirdTurtle();
}