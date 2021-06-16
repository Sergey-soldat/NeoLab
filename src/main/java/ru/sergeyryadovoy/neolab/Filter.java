package ru.sergeyryadovoy.neolab;

import org.jetbrains.annotations.NotNull;

public class Filter {



    public boolean animalEqualsToCondition(Animal animal, Condition condition) {
        return (condition.getFood().equals("[") || condition.getFood().equals(animal.getFood())) && (condition.getWeight().equals(animal.getWeight())) && (condition.getSize().equals(animal.getSize()));
    }

    public void FilterAWithC(Animal[] animals, @NotNull Condition[] conditions, String[] conditionArray) {
        int counter = 0;
        for(int i = 0; i<conditionArray.length; i++ ) {
            if(conditionArray[i]==null) {
                conditionArray[i] = "";
            }
        }
        for (Condition condition : conditions) {
            for (Animal animal : animals) {
                if (animalEqualsToCondition(animal, condition)) {
                    counter++;
                    System.out.println("Количество совпадений: " + counter);
                }
            }
        }
    }
}