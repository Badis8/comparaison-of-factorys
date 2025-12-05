package com.learncenter.design.pattern.synchronous.builder.turtlebuilder;



public class TurleExpert {

    public void makeNormalTurtle(TurtleBuilder builder){

        builder.addHeadLength(2);

        builder.addNumberOffLegs(4);

        builder.addHome("carapace");
    }

    public void makeWeardTurtle(TurtleBuilder builder){

        builder.addHeadLength(0);

        builder.addNumberOffLegs(1);

        builder.addHome("mexico");
    }


}




