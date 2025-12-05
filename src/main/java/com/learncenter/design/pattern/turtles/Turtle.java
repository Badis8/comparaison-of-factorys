package com.learncenter.design.pattern.turtles;



public class Turtle {

    private int headLength;
    private int numberOfLegs;
    private String home;

    public Turtle( ) {

    }

    public Turtle(int h,int n,String ho ) {
    this.headLength=h;
    this.numberOfLegs=n;
    this.home = ho;
    }



    public void setHeadLength(int headLength) {
        this.headLength = headLength;
    }



    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }



    public void setHome(String home) {
        this.home = home;
    }


    public void swim(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turtle turtle = (Turtle) o;
        return headLength == turtle.headLength &&
                numberOfLegs == turtle.numberOfLegs  ;
    }

}
