package com.Vyshnavi.facadeDP;

public class Libraries {
    String type;
    Libraries(String type){
        this.type=type;
    }

    @Override
    public String toString() {
        return "Libraries{" +
                "type='" + type + '\'' +
                '}';
    }
}
