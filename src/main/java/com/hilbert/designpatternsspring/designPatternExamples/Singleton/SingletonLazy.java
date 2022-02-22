/*
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.Singleton;

public class SingletonLazy {

    private static SingletonLazy singleInstance;

    private SingletonLazy(){
        super();
    };

    public static SingletonLazy getInstance(){

        if ( singleInstance == null ) {
            singleInstance = new SingletonLazy();
        }

        return singleInstance;
    }

}
