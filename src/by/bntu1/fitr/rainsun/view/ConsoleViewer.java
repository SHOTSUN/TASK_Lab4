package by.bntu1.fitr.rainsun.view;

public class ConsoleViewer implements Viewer {
    
    public ConsoleViewer(){}

    @Override
    public void print (Object object){
        System.out.println(object);
    }
    
}
