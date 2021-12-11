package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String mapToJSON(Map<String,Integer> map){
        for (Map.Entry<String,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue().toString());
        }
        return null;
    }

    public static void main(String[] args) {
        Map<String, Integer> javaExam = new HashMap<>();
        javaExam.put("ivanov" , 50 );
        javaExam.put("petrov" , 60 );
        javaExam.put("sidorov" , 70 );
        /*
        {"ivanov" : 50 , "petrov" : 60 , "sidorov" : 70}
        */
        System.out.println(javaExam);
    }
}