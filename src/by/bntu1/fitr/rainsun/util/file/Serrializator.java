package by.bntu1.fitr.rainsun.util.file;

import java.io.*;
import java.io.IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Serrializator {

    static final Logger log = LogManager.getLogger(FileManager.class);

    public static void saveInFile(Serializable object, String fileName) {

        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName)))) {

            out.writeObject(object);

        } catch (IOException e) {
            log.error(e.toString());

        }

    }

    public static <T> T loadFromFile(String fileName) {
        T object = null;

        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(fileName)))) {

            object = (T) in.readObject();

        } catch (ClassNotFoundException | IOException e) {
            log.error(e.toString());

        }

        return object;
    }

}
