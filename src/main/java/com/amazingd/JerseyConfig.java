package com.amazingd;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.amazingd.resource.PessoaController;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(PessoaController.class);
    }

}