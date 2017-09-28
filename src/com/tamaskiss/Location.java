package com.tamaskiss;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exist;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null){
            this.exist = new HashMap<>(exits);
        } else {
            this.exist = new HashMap<>();
        }

        this.exist.put("Q", 0);
    }

//    public void addExit(String direction, int location){
//        exist.put(direction,location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExist() {
        return new HashMap<>(exist);
    }
}
