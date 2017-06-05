package by.bntu1.fitr.rainsun.util.file;

import by.bntu1.fitr.rainsun.model.entity.containers.Depo;
import by.bntu1.fitr.rainsun.model.entity.containers.Train;
import by.bntu1.fitr.rainsun.model.entity.trains.Armored;
import by.bntu1.fitr.rainsun.model.entity.trains.Simple;

public class MyParser {
    

    public static void parse(String msg, Depo depo) {
        String[] parts = msg.split("#");
        
        for (String trains : parts) {
            Train train = new Train();
            String[] coaches = trains.split("\n");

            for (String coach : coaches) {
                String[] p = coach.split("-");

                if (p.length == 2) {
                    String[] dat = p[1].split(",");

                    if (p[0].equalsIgnoreCase("Armored coach")) {

                        train.add(new Armored(Integer.parseInt(dat[0]),
                                Integer.parseInt(dat[1]),
                                Integer.parseInt(dat[2])));

                    } else if (p[0].equalsIgnoreCase("Simple coach")) {

                        train.add(new Simple(Integer.parseInt(dat[0]),
                                Integer.parseInt(dat[1]),
                                Integer.parseInt(dat[2])));
                    }
                }
            }

            depo.add(train);
        }
    }
}
