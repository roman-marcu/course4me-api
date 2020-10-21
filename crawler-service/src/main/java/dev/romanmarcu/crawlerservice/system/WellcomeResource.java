package dev.romanmarcu.crawlerservice.system;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/system")
@Produces(MediaType.APPLICATION_JSON)
public class WellcomeResource {

        @GET
        public String sayHi() {
            return "Hi !!!";
        }
}
