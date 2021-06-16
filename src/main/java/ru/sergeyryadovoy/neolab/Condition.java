package ru.sergeyryadovoy.neolab;

public class Condition {
    private String weight;
    private String size;
    private String food;

    public Condition(String weight, String size, String food) {
        this.weight = weight;
        this.size = size;
        this.food = food;
    }

    @Override
    public String toString() {
        return "Condition{" +
                ", weight='" + weight + '\'' +
                "size='" + size + '\'' +
                ", food='" + food + '\'' +
                '}';
    }

    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getFood() {
        return food;
    }
    public void setFood(String food){
        this.food = food;
    }


}