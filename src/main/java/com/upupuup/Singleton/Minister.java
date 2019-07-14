package com.upupuup.Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Minister {
    public static void main(String[] args) {
        King king1 = King.getInstance();
        // king1.kingInfo();

        King king2 = King.getInstance();
        // king2.kingInfo();

        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("1", "1");
        hashtable.put("2", "2");
        // hashtable.put(null, null);
        if (hashtable.contains("2")) {
            System.out.println(hashtable.get("2"));
        }

        Map<String, String> hashMap = new HashMap<String, String>(16);
        hashMap.put("1", "1");
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        hashMap.put(null, null);
        if (hashMap.containsKey("2")) {
            System.out.println(hashMap.get("2"));
        }

        ArrayList<String> list = new ArrayList<String>();
        list.add(null);
        list.add(null);

        max(1, 2);

        Integer.parseInt("aaa");
        Integer.valueOf("111");
    }



    public static void max(int a, int b) {
        System.out.println(a + b + "INT");
    }

    public static void max(float a, float b) {
        System.out.println(a + b);
    }
}
