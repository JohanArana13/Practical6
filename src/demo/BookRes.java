package demo;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by HaouJohan on 11/30/2016.
 */
@Path("/book")
public class BookRes {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getResource(){
        Gson gson = new Gson();
        return gson.toJson(new Book());
    }
}
