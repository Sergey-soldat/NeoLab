package ru.sergeyryadovoy.neolab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParcerCondition {
    public static void parcerCondition() throws FileNotFoundException {
        File file = new File("Condition.txt");
        Scanner r = new Scanner(file);
        Condition condition = new Condition(conditionArray[0], conditionArray[1], conditionArray[2]);
        Condition[] conditions = new Condition[1];
        int i = 0;
        while(r.hasNext()) {
            String line = r.nextLine();

            String[] conditionArray = line.split(",");

//            Condition condition = new Condition(conditionArray[0], conditionArray[1], conditionArray[2]);
            conditions[i] = condition;
            System.out.println(conditions[i]);
            i++;
        }
    }
}
