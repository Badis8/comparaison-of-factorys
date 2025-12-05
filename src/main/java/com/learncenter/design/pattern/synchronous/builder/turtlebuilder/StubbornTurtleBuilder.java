package com.learncenter.design.pattern.synchronous.builder.turtlebuilder;

import com.learncenter.design.pattern.turtles.Turtle;

public class StubbornTurtleBuilder implements TurtleBuilder {

    private Turtle turtle=new Turtle();

    @Override
    public void addHeadLength(int length) {
        turtle.setHeadLength(5-length);
    }

    @Override
    public void addNumberOffLegs(int legs) {
        turtle.setNumberOfLegs(legs*4);
    }

    @Override
    public void addHome(String name) {
    turtle.setHome(name);
    }

    public Turtle getTurtle(){
        return this.turtle;
    }

    public void cleanTurtle(){
        this.turtle=new Turtle();
    }
}
