package com.Vyshnavi.facadeDP;

public class CodeEnvironment {
    String type;
    CodeEnvironment(String type){
        this.type=type;
    }

    @Override
    public String toString() {
        return "CodeEnvironment{" +
                "type='" + type + '\'' +
                '}';
    }
}
