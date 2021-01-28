package edu.isu.cs.cs2263.gson;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOManager {



    /*List<Student> readData(String file){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = "";

        try {  json = Files.readString(Paths.get(file)); }
        catch (IOException ex) { ex.printStackTrace(); }

        List<Student> data = gson.fromJson(json, Student>.class);
        return data;

    }*/
    void writeData(String file, List<Student> data){



        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(data);

        try { Files.writeString(Paths.get("./students.json"), json); }
        catch (IOException ex) { ex.printStackTrace(); }

    }

}
