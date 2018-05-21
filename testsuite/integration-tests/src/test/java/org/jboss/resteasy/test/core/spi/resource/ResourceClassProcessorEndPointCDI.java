package org.jboss.resteasy.test.core.spi.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/patched")
public class ResourceClassProcessorEndPointCDI {
    @GET
    @Path("pure")
    @Produces("text/plain")
    public String pure() {
        return "<a></a>";
    }

    @GET
    @Path("custom")
    @Produces("text/plain")
    public String custom() {
        return "<a></a>";
    }

}