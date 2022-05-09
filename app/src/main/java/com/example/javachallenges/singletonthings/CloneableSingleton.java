package com.example.javachallenges.singletonthings;

// Java code to explain cloning
// issue with singleton
class SuperClass implements Cloneable
{
    int i = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

// Singleton class
class CloneableSingleton extends SuperClass
{
    // public instance initialized when loading the class
    public static CloneableSingleton instance = new CloneableSingleton();

    private CloneableSingleton()
    {
        // private constructor
    }
}

class GFGClone
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        CloneableSingleton instance1 = CloneableSingleton.instance;
        CloneableSingleton instance2 = (CloneableSingleton) instance1.clone();
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());
    }
}

