package by.bntu1.fitr.rainsun.controll;

import by.bntu1.fitr.rainsun.model.entity.comparators.TrainComparator;
import by.bntu1.fitr.rainsun.model.logic.Counter;
import by.bntu1.fitr.rainsun.model.entity.containers.Depo;
import by.bntu1.fitr.rainsun.model.entity.containers.Train;
import by.bntu1.fitr.rainsun.model.entity.trains.Coach;
import by.bntu1.fitr.rainsun.model.entity.trains.CoachConst;
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

        Depo depo = Creator.createDepo(3);
        Depo depo2 = new Depo();
        Viewer view = ViewerManager.get("Console");
        
        view.print("\n( " + CoachConst.WEIGHT + ", " + CoachConst.LENGTH + ", " + 
                CoachConst.ARMOR + "/" + CoachConst.TYPE + " )\n\n");
        
        view.print(depo);
        /*
        
        Viewer view2 = ViewerManager.get("File");
        
        view2.print("fghjkl");

        FileManager.write("depo3.txt", depo.toString());
        MyParser.parse(FileManager.read("depo3.txt"), depo2);
        view.print(depo2.toString());
        
      
        view.print("------------");
        
        
        Serrializator.saveInFile(depo2, "d.dat");
        //view.print(Serrializator.loadFromFile("d.dat"));
        
        Object o = Serrializator.loadFromFile("d.dat");
        
        view.print(o.getClass().getName());
        
        
        
        
        BinaryFileManager.write("d.dat", depo.toString());
        view.print(depo.toString());
        */
        //view.print(BinaryFileManager.read("d.dat"));
        
        
    }

}
