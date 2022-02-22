/*
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.Strategy;

public class TestStrategy {
    public static void main(String[] args) {

        Behavior defensive = new DefensiveBehavior();
        Behavior aggressive = new AggressiveBehavior();
        Behavior normal = new NormalBehavior();

        Machina machina = new Machina();

        machina.setBehavior(normal);
        machina.move();
        machina.move();
        machina.setBehavior(defensive);
        machina.move();
        machina.setBehavior(aggressive);
        machina.move();
        machina.move();

    }
}
