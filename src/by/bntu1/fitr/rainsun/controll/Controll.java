package by.bntu1.fitr.rainsun.controll;

import by.bntu1.fitr.rainsun.model.entity.comparators.TrainComparator;
import by.bntu1.fitr.rainsun.model.logic.Counter;
import by.bntu1.fitr.rainsun.model.entity.containers.Depo;
import by.bntu1.fitr.rainsun.model.entity.containers.Train;
import by.bntu1.fitr.rainsun.model.entity.trains.Coach;
import by.bntu1.fitr.rainsun.model.logic.Searcher;
import by.bntu1.fitr.rainsun.model.logic.Sorter;
import by.bntu1.fitr.rainsun.util.file.BinaryFileManager;
import by.bntu1.fitr.rainsun.util.Creator;
import by.bntu1.fitr.rainsun.util.file.FileManager;
import by.bntu1.fitr.rainsun.util.file.MyParser;
import by.bntu1.fitr.rainsun.util.file.Serrializator;
import by.bntu1.fitr.rainsun.view.Viewer;
import by.bntu1.fitr.rainsun.view.ViewerManager;

public class Controll {

    public static void main(String[] args) {

        Depo depo = new Depo();
        Depo depo2 = new Depo();
        Creator.createDepo(depo, 3);
        Viewer view = ViewerManager.get("Console");

        FileManager.write("depo3.txt", depo.toString());
        MyParser.parse(FileManager.read("depo3.txt"), depo2);
        view.print(depo.toString());
        
      
        view.print("------------");
        
        Serrializator.saveInFile(depo2, "deposs.dat");
        System.out.println(Serrializator.loadFromFile("deposs.dat").toString());
        
        
        /*BinaryFileManager.write("d.dat", depo.toString());
        view.print(depo.toString());
        
        view.print(BinaryFileManager.read("d.dat"));*/
    }

}
