package by.BNTU.FITR.RAINSUN.model.entity.containers;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author SHOTSUN
 */
public class Depo implements Iterable<Train> {

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
        String result = "\n\tTrains:\n";

        for (Train train : depo) {
            result += train.toString();

        }

        return result;

    }

}
