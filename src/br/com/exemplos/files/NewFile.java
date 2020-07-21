package br.com.exemplos.files;

import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) {
        try {
            File file = new File("/home/oem/JavaExemplos/src/br/com/exemplos/files/myfile.txt");

            if(file.createNewFile())System.out.println("Success!");
            else System.out.println ("Error, file already exists.");
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
