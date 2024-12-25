package org.example;



import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonToXml {
    public static void main(String[] args) throws IOException  {



        String jsonInput = new String(Files.readAllBytes(Paths.get("src/main/resources/JsonFile.json")));

        JSONObject jsonObject = new JSONObject(jsonInput);
        String xmlOutput = XML.toString(jsonObject);

        System.out.println("Converted XML:");
        System.out.println(xmlOutput);




    }
}



