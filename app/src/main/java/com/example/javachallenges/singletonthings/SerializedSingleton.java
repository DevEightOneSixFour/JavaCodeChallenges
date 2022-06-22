package com.example.javachallenges.singletonthings;

// Java code to explain effect of
// Serialization on singleton classes

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

class SerializedSingleton implements Serializable {
    // public instance initialized when loading the class
    public static SerializedSingleton instance = new SerializedSingleton();

    private SerializedSingleton() {
        // private constructor
    }
}


class GFG {

    public static void main(String[] args) {
        try {
            SerializedSingleton instance1 = SerializedSingleton.instance;
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));

            SerializedSingleton instance2 = (SerializedSingleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

