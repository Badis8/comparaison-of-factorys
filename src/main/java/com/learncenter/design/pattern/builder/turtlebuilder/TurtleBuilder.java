package com.learncenter.design.pattern.builder.turtlebuilder;

public interface TurtleBuilder {

    public void addHeadLength(int length);

    public void addNumberOffLegs(int legs);

    public void addHome(String name);
}
