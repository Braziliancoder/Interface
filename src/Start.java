import javax.print.DocFlavor;

/**
 * Created by cedricbuser on 24.05.17.
 */

import java.util.Scanner;

public class Start {


    public static void main(String[] args) {


        Double player = 20.0;
        Double wert = 0.0;
        Double wert2 = null;
        Double wert1 = null;

        getraenkeInt bier = new Bier();
        Getraenke l = new Getraenke();
        getraenkeInt Gin = new Spirituosen();

        boolean exit = false;
        while (!exit) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("*****************");
            System.out.println("Geben sie Ihre Auswahl ein: ");
            System.out.println("1 = Drink Gin");
            System.out.println("2 = Drink Beer");
            System.out.println("0 = Close Application");
            System.out.println("3 = Show Drunken Level");
            String ein0 = scanner.nextLine();


            if (ein0.equals("1")) {
                l.add(Gin);
                System.out.println("You Drunk a Gin");
            } else if (ein0.equals("2")) {
                l.add(bier);
                System.out.println("You Drunk a Beer");
            } else if (ein0.equals("3")) {


                   for (getraenkeInt x : l.getlist()) {

                       wert1 = x.getdrunk(0.5);

                       wert = wert + wert1;

                       player = player - wert;

                       System.out.println(player);
                       System.out.println(x.getname());
                       System.out.println(x.getdrunk(0.5));
                   }

            } else if (ein0.equals("0")) {
                System.exit(0);

            } else {
                System.out.println("Wrong Input");
            }


        }
    }
}
