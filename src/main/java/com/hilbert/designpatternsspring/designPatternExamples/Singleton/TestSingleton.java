/*
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.Singleton;

public class TestSingleton {
    public static void main(String[] args) {

        System.out.println("All memory addresses must be equal");

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println(singletonLazy1+"\n");

        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println(singletonEager);
        System.out.println(singletonEager1+"\n");

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        SingletonLazyHolder singletonLazyHolder1 = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        System.out.println(singletonLazyHolder1+"\n");
    }
}
