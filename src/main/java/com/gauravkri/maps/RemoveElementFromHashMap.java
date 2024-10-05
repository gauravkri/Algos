package com.gauravkri.maps;

import java.util.HashMap;
import java.util.Map;

public class RemoveElementFromHashMap {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("n", "t");
        map.put("m", "y");

        map.remove("n");
    }
}
