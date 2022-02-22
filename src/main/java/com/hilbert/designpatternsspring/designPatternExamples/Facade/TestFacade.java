/*
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.Facade;

public class TestFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrateClient("Venilson", "64654-300");
    }
}
