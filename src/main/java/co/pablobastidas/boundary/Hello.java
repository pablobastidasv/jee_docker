package co.pablobastidas.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author pablobastidasv
 */
@Path("/hello")
public class Hello {

    @GET
    public String hello(){
        return "Hello Buddies!!!";
    }

}
