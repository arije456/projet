package rest.utilities;

import java.util.HashSet;
import java.util.Set;

import io.swagger.jaxrs.config.BeanConfig;
import rest.ressource.GestionEmploye;


public class RestActivator {

	public RestActivator() {
		super();
		// TODO Auto-generated constructor stub
BeanConfig beanConfig = new BeanConfig();
		
		beanConfig.setVersion("1.0.0");
		beanConfig.setSchemes(new String[]{"http"});
		beanConfig.setHost("localhost:8090");
		beanConfig.setBasePath("jiji_gr1/api");
		beanConfig.setResourcePackage("rest.ressources");
		beanConfig.setScan(true);

		// TODO Auto-generated constructor stub
	}

    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(GestionEmploye.class);
        // Available at localhost:port/swagger.json
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        return resources;

    }
	
	
	

}
