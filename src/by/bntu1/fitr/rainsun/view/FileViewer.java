package by.bntu1.fitr.rainsun.view;

import by.bntu1.fitr.rainsun.util.file.FileManager;

public class FileViewer implements Viewer {

    private String fileName;
    
    public FileViewer(){}

    public FileViewer(String fileName) {
        this.fileName = fileName;
    }

    public void print(Object object) {
        FileManager.write(fileName, object.toString());
    }

}
