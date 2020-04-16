package config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api")
public class ApplicationConfig extends Application {

    //Control + O


    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> res = new HashSet<>();

        res.add(services.FirstService.class);
        res.add(services.UserServices.class);

        return res;
    }
}
