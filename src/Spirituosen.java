/**
 * Created by cedricbuser on 24.05.17.
 */
import java.util.Random;

public class Spirituosen implements getraenkeInt {

    double pegelfinal;
    double pegelsumme;

    @Override
    public Double getdrunk(Double pegel) {


        double random = (int) (Math.random() * 10) + 1;

        Double pegelfinal = pegel * random;

        return pegelfinal;
    }

    public String getname (){

        String methodegname = "Gin";
        String gname = methodegname;

        return gname;
    }

}
