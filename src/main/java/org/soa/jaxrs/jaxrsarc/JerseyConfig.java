package org.soa.jaxrs.jaxrsarc;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("org.soa.jaxrs.jaxrsarc");
    }

}
