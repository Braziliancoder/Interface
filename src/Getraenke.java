import java.util.ArrayList;
import java.util.List;

/**
 * Created by cedricbuser on 24.05.17.
 */
public class Getraenke  {


    private ArrayList<getraenkeInt> getraenkeliste = new ArrayList<getraenkeInt>();


    public void add(getraenkeInt drink) {
        this.getraenkeliste.add(drink);
    }

    public ArrayList<getraenkeInt> getlist() {

        return getraenkeliste;

    }
}