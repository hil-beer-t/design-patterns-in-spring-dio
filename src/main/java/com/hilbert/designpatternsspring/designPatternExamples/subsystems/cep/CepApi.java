/*
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.subsystems.cep;

public class CepApi {
    private static final CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String getCity( String cep ){
        return "Uberlândia";
    }

    public String getState( String cep ){
        return "MG";
    }
}
