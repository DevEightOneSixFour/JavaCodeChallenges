package com.example.javachallenges;

import android.view.View;
import com.example.javachallenges.singletonthings.Singleton;

public class Example implements View.OnClickListener, View.OnContextClickListener {

    // Polymorphism
    // overriding & overloading

    // overriding
    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onContextClick(View view) {
        return false;
    }

    // overloading
    public void printThis(String str) {
        System.out.println(str);
    }

    public void printThis(int num) {
        System.out.println("Number: " + num);
    }


}


