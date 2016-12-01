package demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by HaouJohan on 11/30/2016.
 */
@Path("/hi")
public class HelloWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPlainMessage(){
        return "Hi World!";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHTMLMessage(){
        return "<b>Hi World!</b>";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getXML(){
        return "<hi>Hi World!</hi>";
    }
}
