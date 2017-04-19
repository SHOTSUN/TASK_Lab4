
package by.BNTU.FITR.RAINSUN.model.entity.containers;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Владислав
 */
public class Train implements Iterable<Coach>{

    private final List<Coach> train;

    public Train(){
        train = new LinkedList();
    }
    
    public Train(List<Coach> box) {
        train = box;
    }
    
    public int size() {
        return train.size();
    }
    
    public Train(Coach ... obj) {
        train = new LinkedList();
        for (Coach c : obj) {
            train.add(c);
        }
    }
    
    public Train(Coach coach){
        train = new LinkedList();
        train.add(coach);
    }
    
    public void add(Coach ... obj) {
        for (Coach c : obj) {
            train.add(c);
        }
    }

    public List<Coach> get() {
        return train;
    }
    
    @Override
    public Iterator<Coach> iterator(){
        return train.iterator();
    }

    @Override
    public String toString() {
        
        int rez =0;
        
        for(Coach c: train){
            rez += c.getWeight();
        }

        StringBuilder showBag = new StringBuilder();
        
        showBag.append("\n\t").append(rez).append(" - Train weight\n");
            
        for (Coach thing : train) {
            showBag.append(thing.toString()).append("\n");
        }

        return showBag.toString();
    }

}
