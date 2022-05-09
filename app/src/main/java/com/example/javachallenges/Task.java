package com.example.javachallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

// adb shell pm clear [package]
// adb shell pm uninstall [package]
public class Task {

    private String taskType;
    private int taskRequiredRam;
    private int taskRequiredCPU;
    public Task(String taskType, int taskRequiredRam, int taskRequiredCPU) {
        this.taskType = taskType;
        this.taskRequiredCPU = taskRequiredCPU;
        this.taskRequiredRam = taskRequiredRam;
    }
                                                            // Task
    public static Comparator taskTypeComparer = new Comparator<Task>() {

        @Override
        public int compare(Task task, Task t1) {
            String task1 = task.getTaskType().toLowerCase();
            String task2 = t1.getTaskType().toLowerCase();

            return task1.compareTo(task2);
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }
    };

    public void usingMethod() {
        ArrayList<Task> arrayList = new ArrayList<Task>();
        arrayList.add(new Task("cpuBound", 128,5));
        arrayList.add(new Task("ioBound", 256,17));
        arrayList.add(new Task("CpuBound", 512,9));
        arrayList.add(new Task("ioBound", 1024,21));

        System.out.println("Before sort");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //Collections
        Collections.sort(arrayList, Task.taskTypeComparer);
        System.out.println("After sort");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getTaskType());
        }
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public int getTaskRequiredRam() {
        return taskRequiredRam;
    }

    public void setTaskRequiredRam(int taskRequiredRam) {
        this.taskRequiredRam = taskRequiredRam;
    }

    public int getTaskRequiredCPU() {
        return taskRequiredCPU;
    }

    public void setTaskRequiredCPU(int taskRequiredCPU) {
        this.taskRequiredCPU = taskRequiredCPU;
    }
}
