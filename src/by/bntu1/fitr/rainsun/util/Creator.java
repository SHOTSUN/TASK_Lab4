package by.bntu1.fitr.rainsun.util;

import by.bntu1.fitr.rainsun.model.entity.trains.Simple;
import by.bntu1.fitr.rainsun.model.entity.trains.Armored;
import by.bntu1.fitr.rainsun.model.entity.containers.Depo;
import by.bntu1.fitr.rainsun.model.entity.containers.Train;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Random;

/**
 * @author Владислав
 */
public class Creator {

    public static Depo createDepo(int numbTrains) {

        Depo depo = new Depo();
        
        Random myRandom = new Random();
        int minNum = 2;
        for (int i = 0; i < numbTrains; i++) {
            Train train = new Train();

            Creator.create(train, minNum + myRandom.nextInt(15));
            depo.add(train);

        }
        return depo;
    }

    public static void create(Train train, int n) {
        Random myRandom = new Random();

        for (int i = 0; i < n - 1; i++) {
            int buf = myRandom.nextInt(n);
            if (buf % 2 == 0) {
                train.add(new Armored(15 + myRandom.nextInt(40), 10 + myRandom.nextInt(40), myRandom.nextInt(300)));
            } else {
                train.add(new Simple(15 + myRandom.nextInt(40), 10 + myRandom.nextInt(40), 1 + myRandom.nextInt(5)));
            }

        }
    }

}
