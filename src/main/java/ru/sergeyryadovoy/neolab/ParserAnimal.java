package ru.sergeyryadovoy.neolab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParserAnimal {

    Animal[] animals = new Animal[3];
    public void parserA() throws FileNotFoundException {
        File file = new File("FileIn.txt");
        Scanner r = new Scanner(file);
        int i = 0;
        while (r.hasNext()) {
            String line = r.nextLine();

            String[] animalArray = line.split(",");

            Animal animal = new Animal(animalArray[0], animalArray[1], animalArray[2]);
            animals[i] = animal;
            System.out.println(animals[i]);
            i++;
        }
        r.close();
    }
}
