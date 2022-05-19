package com.example.javachallenges.singletonthings;

import com.example.javachallenges.Task;

// Java code to explain double check locking
public class Singleton
{
    public static void main(String[] args) {
        // Testing Task question
        Task task = new Task("1",1,1);
        task.usingMethod();
    }
    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static Singleton instance; // Singleton();

    private Singleton()
    {
        // private constructor
    }

    public static Singleton fetchInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    // Thread safe creation of a Singleton
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            //synchronized block to remove overhead
            synchronized (Singleton.class)
            {
                if(instance==null)
                {
                    // if instance is null, initialize
                    instance = new Singleton();
                }

            }
        }
        return instance;
    }

}
 // Dagger or Hilt dependency injection
 // Dagger annotations
// @Component, @Provides, @Inject, @Module, @Subcomponents, @Singleton

// Hilt annotations
// @Provides, @Inject, @Module, @HiltApplication, @HiltAndroidViewModel, @Singleton








