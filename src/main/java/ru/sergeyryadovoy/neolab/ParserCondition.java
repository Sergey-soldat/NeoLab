package ru.sergeyryadovoy.neolab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ParserCondition {
//    Condition[] conditions = new Condition[1];
    List<Condition> conditions = new ArrayList<>();

    public void parserC() throws FileNotFoundException {
        File file = new File("Condition.txt");
        Scanner r = new Scanner(file);
        int i = 0;
        while (r.hasNext()) {
            String line = r.nextLine();

//            String[] conditionArray = line.split(",");

            String[] intermediate = line.split(",");
            String[] conditionArray = new String[3];
            System.arraycopy(intermediate, 0, conditionArray, 0, intermediate.length);
            for(int j = 0; j<conditionArray.length; j++ ) {
                if(conditionArray[j]==null) {
                    conditionArray[j] = "";
                }
            }



            Condition condition = new Condition(conditionArray[0], conditionArray[1], conditionArray[2]);



            conditions.add(condition);
            System.out.println(conditions.get(i));
            i++;
        }
        r.close();
    }
}
