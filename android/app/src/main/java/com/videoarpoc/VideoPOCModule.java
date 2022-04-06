package com.videoarpoc;
import com.banuba.agora.plugin.model.ArEffect;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.banuba.agora.plugin.BanubaEffectsLoader;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import java.util.List;

public class VideoPOCModule extends ReactContextBaseJavaModule {
    ReactApplicationContext ctx;
   VideoPOCModule(ReactApplicationContext context) {
       super(context);
       ctx = context;
   }

   @NonNull
   @Override
    public String getName() {
        return "VideoPOCModule";
    }

    @ReactMethod
    public void joinChannel() {
        List<ArEffect> effects = new BanubaEffectsLoader(ctx).loadEffects();
        Log.d(null, "#42412312312312312" + effects.toString());
        Toast.makeText(ctx, "effects: " + effects.toArray().length, Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(ctx, VideoPOCActivity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ctx.startActivity(myIntent);
    }
}