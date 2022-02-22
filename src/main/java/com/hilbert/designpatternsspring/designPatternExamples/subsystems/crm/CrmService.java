/*
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.subsystems.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String city, String state) {
        System.out.println("\n\tClient has been saved successfully in CRM system \n");
        System.out.println( "\t"+
                name+"\n\t"+
                cep+"\n\t"+
                city+"\n\t"+
                state);
    }
}
