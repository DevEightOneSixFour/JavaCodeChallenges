package com.example.javachallenges;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
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

// data class -> POJO in Java
// Plain Old Java Object


//data class User(
//        val name: String,
//        val id: Int
//) {
//
//}
//
//class User {
//    String name;
//    int id;
//
//    // getters, setter, toString, hashCode, equals
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id && Objects.equals(name, user.name);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, id);
//    }
//}



