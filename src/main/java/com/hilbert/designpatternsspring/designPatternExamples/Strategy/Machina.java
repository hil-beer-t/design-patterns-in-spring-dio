/*
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.Strategy;

public class Machina implements Behavior {

    private Behavior behavior;

    public Machina(){
        super();
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void move() {
        behavior.move();
    }
}
