//package com.example.javachallenges;
//
//import com.example.javachallenges.singletonthings.Singleton;
//
//public class SingletonClass {
//
//    // private instance, so that it can be
//    // accessed by only by getInstance() method
//    private static SingletonClass instance; // Singleton();
//    private static Object lock;
//
//    private SingletonClass() {
//        // private constructor
//    }
//// synchronized -> thread safe
//
//    // locking at method level -> the class is blocked
//    public synchronized static SingletonClass fetchInstance() {
//        if (instance == null) {
//            instance = new SingletonClass();
//        }
//        return instance;
//    }
//
//    // locking at the block level -> thread are only stopped inside of the block of code
//    public static SingletonClass getInstance() {
//        if (instance == null) {
//            synchronized (lock) {
//                if (instance == null) {
//                    instance = new SingletonClass();
//                }
//            }
//        }
//        return instance;
//    }
//
//
//    // static vs non-static
//    public void static printThis(){
//        System.out.println("*");
//    }
//
//    public void printThis() {
//        System.out.println("*");
//    }
//
//    for(i in 1..100000) {
//       //static printThis();
//    }
//
//    for(i in 1..100000) {
//        //non-static printThis();
//    }
//
//    SingletonClass().printThis() //non static
//    SingletonClass.printThis() // static
//}
