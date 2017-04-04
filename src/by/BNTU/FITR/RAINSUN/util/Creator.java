package by.BNTU.FITR.RAINSUN.util;

import by.BNTU.FITR.RAINSUN.model.entity.trains.Simple;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Armored;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Depo;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import java.util.Random;

/**
 * @author Владислав
 */
public class Creator {
    
    public static void createDepo(Depo depo, int numbTrains) {

        Random myRandom = new Random();
        int minNum = 2;
        for (int i = 0; i < numbTrains; i++) {
            Train train = new Train();
            
            Creator.Create(train, minNum + myRandom.nextInt(15));
            depo.add(train);
            
        }
    }

    public static void Create(Train train, int n) {
        Random myRandom = new Random();

        for (int i = 0; i < n-1; i++) {
            int buf = myRandom.nextInt(n);
            if (buf % 2 == 0) {
                train.add(new Armored(15 + myRandom.nextInt(40), myRandom.nextInt(300)));
            } else {
                train.add(new Simple(15 + myRandom.nextInt(40), 1 + myRandom.nextInt(5)));
            }

        }
    }
}
