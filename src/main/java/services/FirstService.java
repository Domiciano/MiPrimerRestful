package services;


import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Stateless
@Path("first")
public class FirstService {

    @GET
    @Path("echo")
    public String echo(){
        return "Hola programacion en red";
    }

    @GET
    @Path("fecha")
    public String fecha(){

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fecha = sdf.format(calendar.getTime());

        return fecha;
    }

    @GET
    @Path("suma")
    public String suma(  @QueryParam("A") String a, @QueryParam("B") String b  ){
        int suma = Integer.parseInt(a) + Integer.parseInt(b);
        return ""+suma;
    }

}
