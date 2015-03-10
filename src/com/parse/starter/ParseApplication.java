package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseCrashReporting;
import com.parse.ParseUser;
import android.support.v4.app.NotificationCompat;

public class ParseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Initialize Crash Reporting.
      Parse.initialize(this, "dViWjTPkk7KuLIACw3ztumY2S0QakfY3LZojXveG", "0K3J9wFB8rWrtrcwMzRqSBcWQ4G59O0yVYd5aOkI");

      ParseUser.enableAutomaticUser();
      ParseACL defaultACL = new ParseACL();

// If you would like all objects to be private by default, remove this line.
      defaultACL.setPublicReadAccess(true);

      ParseACL.setDefaultACL(defaultACL, true);
  }
}
