package com.example.activitetest;

import android.app.Activity;
import android.os.Process;

import java.util.ArrayList;
import java.util.List;

public class ActivitityController {
    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for(Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
        android.os.Process.killProcess(Process.myPid());
    }
}
