/*
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.Strategy;

public class NormalBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Moving normally");
    }
}
