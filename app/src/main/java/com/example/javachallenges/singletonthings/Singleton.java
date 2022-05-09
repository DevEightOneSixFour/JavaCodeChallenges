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
    private static Singleton instance;

    private Singleton()
    {
        // private constructor
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
