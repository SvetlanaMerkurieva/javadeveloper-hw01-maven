package myname;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        MyName myName = new MyName("Svitlana", "Merkurieva");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonMyName = gson.toJson(myName);
        System.out.println(jsonMyName);
    }
}