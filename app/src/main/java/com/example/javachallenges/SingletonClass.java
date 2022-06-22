import java.util.StringTokenizer;

//package com.example.javachallenges;
//
//import com.example.javachallenges.singletonthings.Singleton;
//
public class SingletonClass {

    // private instance, so that it can be
    // accessed by only by getInstance() method
    public static SingletonClass instance; // Singleton();
    public SingletonClass instanceDos;
    private static Object lock;

    private SingletonClass() {
        // private constructor
    }
// synchronized -> thread safe
    // locking at method level -> the class is blocked
    public synchronized static SingletonClass fetchInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    // locking at the block level -> thread are only stopped inside of the block of code
    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }


    // static vs non-static
    public void static printThis(){
        String
        System.out.println("*");
    }

    public void printThis() {
        System.out.println("*");
    }


    SingletonClass().printThis() //non static
    SingletonClass.printThis() // static
}

class NewClass {
    SingletonClass sc = new SingletonClass();

    public void methodName() {
        sc.instance;
        SingletonClass
    }
}

companion object {

        }
