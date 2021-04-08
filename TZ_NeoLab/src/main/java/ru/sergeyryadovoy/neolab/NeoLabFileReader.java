package ru.sergeyryadovoy.neolab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NeoLabFileReader {
    private String configPath = "src\\main\\resources\\configuration.xml";

    public NeoLabFileReader () throws FileNotFoundException{

        FileReader fr = new FileReader(configPath);

    }

//    String body = "содержимое xml";
//
//    DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//    Document document = documentBuilder.parse(new ByteArrayInputStream(body.getBytes()));
//
//    NodeList nodeList = document.getElementsByTagName("Сотрудник");
//for(int x=0,size= nodeList.getLength(); x<size; x++) {
//        System.out.println(nodeList.item(x).getAttributes().getNamedItem("Должность").getNodeValue())
//    }

}
