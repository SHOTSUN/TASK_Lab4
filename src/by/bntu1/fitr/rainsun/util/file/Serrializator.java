/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu1.fitr.rainsun.util.file;

import java.io.*;
import java.io.IOException;

/**
 *
 * @author Владислав
 */
public class Serrializator {
    
    public static void saveInFile(Serializable object, String fileName) {

        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName)))) {

            out.writeObject(object);

        } catch (IOException e) {
          ///  exception
          
        }

    }
    
    public static <T>T loadFromFile(String fileName) {
        T object = null;

        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(fileName)))) {

            object = (T) in.readObject();

        } catch (ClassNotFoundException | IOException e) {
            //exception

        }
        return object;
    }
    
}
