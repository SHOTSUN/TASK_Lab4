package by.bntu1.fitr.rainsun.util.file;

import by.bntu1.fitr.rainsun.model.exceptions.CreatingFileException;
import by.bntu1.fitr.rainsun.model.exceptions.NoFileException;
import by.bntu1.fitr.rainsun.model.exceptions.ReadingFileException;
import by.bntu1.fitr.rainsun.model.exceptions.WritingFileException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileManager {

    public static void write(String fileName, String text) {
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new CreatingFileException(e.toString());
        }

        try (BufferedOutputStream writer = new BufferedOutputStream(
                new FileOutputStream(file.getAbsoluteFile(), false))) {
            byte[] byffer = text.getBytes();
            writer.write(byffer);
        } catch (IOException e) {
            throw new WritingFileException(e.toString());
        }
    }

    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);

        try {
            exists(file);

        } catch (FileNotFoundException e) {
            throw new NoFileException(e.toString());
        }

        try (BufferedInputStream reader = new BufferedInputStream(
                new FileInputStream(file.getAbsoluteFile()))) {

            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }

        } catch (IOException e) {
            throw new ReadingFileException(e.toString());
        }

        return sb.toString();
    }

    private static void exists(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }

}
