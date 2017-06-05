package by.bntu1.fitr.rainsun.view;

import java.util.LinkedHashMap;
import java.util.Map;

public class ViewerManager {

    private final static Map<String, Viewer> viewBox = new LinkedHashMap<>();

    private ViewerManager() {
    }

    static {
        ViewerManager.add("Console", new ConsoleViewer());
        
        ViewerManager.add("File", new FileViewer("filezz.txt"));
    }

    public static Viewer get(String key) {
        return viewBox.get(key);
    }

    public static void add(String key, Viewer value) {
        viewBox.put(key, value);
    }

}
