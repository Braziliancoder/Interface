import java.util.Random;

/**
 * Created by cedricbuser on 24.05.17.
 */

public class Bier implements getraenkeInt {


    double pegelfinal;

    @Override
    public Double getdrunk(Double pegel) {


        double random = (int) (Math.random() * 3) + 1;

        pegelfinal = pegel * random;

        return pegelfinal;
    }


    public String getname (){

        String methodegname = "Bier";
        String gname = methodegname;

        return gname;
    }

}
