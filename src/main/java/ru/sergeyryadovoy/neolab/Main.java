package ru.sergeyryadovoy.neolab;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        {
            ParserAnimal parserFileIn = new ParserAnimal();
            parserFileIn.parserA();

            ParserCondition parserCondition = new ParserCondition();
            parserCondition.parserC();

//            Filter filter = new Filter();
//            filter.FilterAWithC(parserFileIn.animals, parserCondition.conditions);
        }
    }
}
