package by.bntu1.fitr.rainsun.util.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import by.bntu1.fitr.rainsun.model.exceptions.CreatingFileException;
import by.bntu1.fitr.rainsun.model.exceptions.WritingFileException;
import by.bntu1.fitr.rainsun.model.exceptions.NoFileException;
import by.bntu1.fitr.rainsun.model.exceptions.ReadingFileException;

public class FileManager {

    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new CreatingFileException(e.toString());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), false))) {
            writer.write(text);
            writer.newLine();
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

        try (BufferedReader reader = new BufferedReader(
                new FileReader(file.getAbsoluteFile()))) {

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
