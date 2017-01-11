package com.amazingd;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amazingd.resource.PessoaController;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
    	register(CORSResponseFilter.class);
        register(PessoaController.class);
    }
    

}