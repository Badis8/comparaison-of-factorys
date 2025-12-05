package com.learncenter.design.pattern.asynchronous.builder.turtlebuilder;

import com.learncenter.design.pattern.turtles.Turtle;

public interface TurtleBuilder {

    void addHeadLength(int length);

    void addNumberOffLegs(int legs);

    void addHome(String name);

    Turtle getTurtle();
}
