package by.bntu1.fitr.rainsun.util.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FileManager {

    static final Logger log = LogManager.getLogger(FileManager.class);

    public static void write(String fileName, String text) {
        log.debug("Write to txt file");
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            throw new IOException();
        } catch (IOException e) {
            log.error(e.toString());
        }

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(file.getAbsoluteFile(), false))) {
            writer.write(text);

            writer.newLine();
        } catch (IOException e) {
            log.error(e.toString());
        }
    }

    public static String read(String fileName) {
        log.debug("Read from txt file");
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);

        exists(file);

        try (BufferedReader reader = new BufferedReader(
                new FileReader(file.getAbsoluteFile()))) {

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
