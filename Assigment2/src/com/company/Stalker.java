package com.company;

import java.util.List;

public class Stalker implements Zona{
    private String name;

    public Stalker(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> event) {
        System.out.println("In short, " +this.name+ "\nI saved you and I will not play nobility: you will complete a couple of tasks for me — and we are even. \nAt the same time, let's see how quickly your head clears up after amnesia \n" + event + "\n");
    }
}
