package by.bntu1.fitr.rainsun.model.entity.containers;

import by.bntu1.fitr.rainsun.util.file.FileManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.io.Serializable;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author SHOTSUN
 */
public class Depo implements Iterable<Train>, Serializable {

    static final Logger log = LogManager.getLogger(FileManager.class);
    
    private List<Train> depo;

    public Depo() {
        depo = new LinkedList();
    }

    public Depo(List<Train> box) {
        depo = box;
    }

    public Depo(Train  train) {
        depo = new LinkedList();
        depo.add(train);
    }

    public void addAll(Train ... trains) {
        depo = new LinkedList();
        for(Train t : trains){
            depo.add(t);
        }
        
    }
    public void clear(){
        depo = null;
    }
    
    public List<Train> getDepo() {
        return depo;
    }
    
    public Train getTrain(int index){
        try{
            return depo.get(index);
        }catch(IndexOutOfBoundsException e){
            log.error(e.toString());
        }
        return null;
    }

    public void add(Train... trains) {
        try {
            for (Train t : trains) {
                depo.add(t);
            }

        } catch (ArrayStoreException e) {
            throw e;
        }
    }

    @Override
    public Iterator<Train> iterator() {
        return depo.iterator();
    }

    @Override
    public String toString() {
        String result = "";

        for (Train train : depo) {
            result += "#\n";
            result += train.toString();
            
        }

        return result;

    }

}
