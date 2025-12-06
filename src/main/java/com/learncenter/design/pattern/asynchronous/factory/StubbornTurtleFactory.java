package com.learncenter.design.pattern.asynchronous.factory;

import com.learncenter.design.pattern.asynchronous.observer.Observer;
import com.learncenter.design.pattern.asynchronous.service.RandomValueService;
import com.learncenter.design.pattern.turtles.Turtle;

import java.util.HashMap;
import java.util.Map;

public class StubbornTurtleFactory implements TurtleFactory, Observer<RandomValueService.Part> {


    Map<String, Object> turtleParts = new HashMap<>();
    // this part requires a mini algorithm
    @Override
    public Turtle createUnexpectedTurtleTurtle() {
        if (turtleParts.size() == 3){ //the day the turtle readyness changes we need to change this
            return  new Turtle( ( int)turtleParts.get("head"),(int)turtleParts.get("legs"),(String)turtleParts.get("home"));
        }
        return null; //no semi state of turtle usable
    }

    @Override
    public void update(RandomValueService.Part value) {
        turtleParts.put(value.type,value.value);
    }
}
