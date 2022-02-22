/*
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.Singleton;

public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }

}