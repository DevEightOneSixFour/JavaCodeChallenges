package com.example.javachallenges;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class AnyType<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

//    Map<String,Object> collection = new TreeMap<>();
//
//    System.out.println(collection.compute("foo", (k,v) -> (v = null)? new ArrayList<Object>() : ((List)v).add("ber")));
//    System.out.println(collection.compute("foo", (k,v) -> (v = null)? new ArrayList<Object>() : ((List)v).add("bar")));

}

