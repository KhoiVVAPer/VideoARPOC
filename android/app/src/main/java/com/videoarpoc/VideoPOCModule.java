package com.videoarpoc;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;

public class VideoPOCModule extends ReactContextBaseJavaModule {
   VideoPOCModule(ReactApplicationContext context) {
       super(context);
   }

   @NonNull
   @Override
    public String getName() {
        return "VideoPOCModule";
    }

    @ReactMethod
    public void createCalendarEvent(String name, String location) {
        Log.d("CalendarModule", "Create event called with name: " + name
            + " and location: " + location);
        ReactApplicationContext context = getReactApplicationContext();
        Intent myIntent = new Intent(context, VideoPOCActivity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(myIntent);
    }
}