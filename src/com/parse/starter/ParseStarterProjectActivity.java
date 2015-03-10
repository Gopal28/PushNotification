package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParsePush;
import com.parse.ParseUser;
import com.parse.PushService;
import com.parse.SaveCallback;

import android.support.v4.app.NotificationCompat;

import org.json.JSONException;
import org.json.JSONObject;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
       // Parse.initialize(this, "dViWjTPkk7KuLIACw3ztumY2S0QakfY3LZojXveG", "0K3J9wFB8rWrtrcwMzRqSBcWQ4G59O0yVYd5aOkI");
       /* Parse.initialize(this, "appId","clientKey");
        PushService.setDefaultPushCallback(this, ParseStarterProjectActivity.class);
        PushService.subscribe(this, "newshirt", ParseStarterProjectActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();*/
       String  android_id = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        Log.e("LOG", "android id >>" + android_id);

        PushService.setDefaultPushCallback(this, ParseStarterProjectActivity.class);

        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put("UniqueId",android_id);
        ParsePush.subscribeInBackground("Giants");

		//ParseAnalytics.trackAppOpenedInBackground(getIntent());


    }

}
