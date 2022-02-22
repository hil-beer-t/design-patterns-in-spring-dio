/**
 * Copyright (c) 2022.
 * @author <a href="https://www.github.com.br/hil_beer_t">Hilbert. D</a>
 */

package com.hilbert.designpatternsspring.designPatternExamples.Facade;

import com.hilbert.designpatternsspring.designPatternExamples.subsystems.cep.CepApi;
import com.hilbert.designpatternsspring.designPatternExamples.subsystems.crm.CrmService;

public class Facade {

    public void migrateClient( String name, String cep) {

        String city = CepApi.getInstance().getCity(cep);
        String state = CepApi.getInstance().getState(cep);

        CrmService.saveClient( name, cep, city, state );
    }

}
