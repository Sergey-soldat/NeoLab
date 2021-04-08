package ru.sergeyryadovoy.neolab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("FileIn.txt");
        Scanner r = new Scanner(file);
        while (r.hasNext()) {
            String line = r.nextLine();



            System.out.println(line);


        }
        r.close();


            String str = "I love Java";
            String[] words = str.split(" ");
            for (String word : words) {
                System.out.println(word);
            }

//        try {
//            NeoLabFileReader reader = new NeoLabFileReader();
//        } catch (FileNotFoundException e) {
//            System.out.println("Не найден файл конфигурации");
//            throw e;
//        }

    }
}
