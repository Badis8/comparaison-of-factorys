package com.learncenter.design.pattern.builder.turtlebuilder;

import com.learncenter.design.pattern.observer.Observer;
import com.learncenter.design.pattern.service.RandomValueService;
import com.learncenter.design.pattern.turtles.Turtle;


public class TurleExpert implements Observer<RandomValueService.Part> {

    private final TurtleBuilder builder;

    public TurleExpert(TurtleBuilder builder) {
        this.builder = builder;
    }

    @Override
    public synchronized void update(RandomValueService.Part part) {

        switch (part.type) {
            case "head" -> builder.addHeadLength((int) part.value);
            case "legs" -> builder.addNumberOffLegs((int) part.value);
            case "home" -> builder.addHome((String) part.value);
        }
        System.out.println("Updated " + part.type + " to " + part.value);
    }

    public Turtle getTurtle() {
        return builder.getTurtle();
    }
}




