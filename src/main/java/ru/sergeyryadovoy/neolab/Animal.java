package ru.sergeyryadovoy.neolab;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2RTFDTM;

import java.util.Arrays;

public class Animal {
    private String weight;
    private String size;
    private String food;
    public Animal(String weight, String size, String food) {
        this.weight = weight;
        this.size = size;
        this.food = food;
    }

    @Override
    public String toString() {
        return "Animal{" +
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
