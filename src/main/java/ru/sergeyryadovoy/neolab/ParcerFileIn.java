package ru.sergeyryadovoy.neolab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParcerFileIn {
    public static void ParcerFileIn() throws FileNotFoundException {
        File file = new File("FileIn.txt");
        Scanner r = new Scanner(file);
//        Animal animals = new Animal("ВЕС", "РАЗМЕР", "ЕДА");
        Animal[] animals = new Animal[3];
        int i = 0;
        while (r.hasNext()) {
            String line = r.nextLine();
//            System.out.println(line);

            String[] animalArray = line.split(",");
//            for (String a : animal) {
//                System.out.println(a);
//            }

            Animal animal = new Animal(animalArray[0], animalArray[1], animalArray[2]);
            animals[i] = animal;
            System.out.println(animals[i]);
            i++;

//            animalArray.setWeight(animalArray[0]);
//            animalArray.setSize(animalArray[1]);
//            animalArray.setFood(animalArray[2]);

//            System.out.println(kozlyatina.getWeight());
//            System.out.println(kozlyatina.getSize());
//            System.out.println(kozlyatina.getFood());

//            for (int i = 0; i < kozl.length; i++) {
//                kozl[i] = animals;
//                System.out.println(kozl[i]);
//            }

//            System.out.println(kozlyatina);
//            System.out.println(kozlyatina);
        }
        r.close();
    }
}
