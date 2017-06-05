package by.bntu1.fitr.rainsun.util.file;

import static by.bntu1.fitr.rainsun.util.file.FileManager.log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class BinaryFileManager {

    static final Logger log = LogManager.getLogger(FileManager.class);

    public static void write(String fileName, String text) {
        log.debug("Write to bin file");
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            log.error(e.toString());

        }

        try (BufferedOutputStream writer = new BufferedOutputStream(
                new FileOutputStream(file.getAbsoluteFile(), false))) {
            byte[] byffer = text.getBytes();
            writer.write(byffer);
        } catch (IOException e) {
            log.error(e.toString());
        }
    }

    public static String read(String fileName) {
        log.debug("Read from bin file");
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);

        exists(file);

        try (BufferedInputStream reader = new BufferedInputStream(
                new FileInputStream(file.getAbsoluteFile()))) {

            int flag;
            while ((flag = reader.read()) != -1) {
                sb.append((char) flag);
            }

        } catch (IOException e) {
            log.error(e.toString());
        }

        return sb.toString();
    }

    private static void exists(File file) {
        if (!file.exists()) {
            log.error(FileNotFoundException.class.toString());
        }
    }

}
