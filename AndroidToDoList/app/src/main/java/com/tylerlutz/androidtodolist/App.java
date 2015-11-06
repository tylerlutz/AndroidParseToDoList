package com.tylerlutz.androidtodolist;
import android.app.Application;
import com.parse.Parse;

/**
 * Created by tyler on 11/5/2015.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this,"GcTxHe57CXqo18DThlQUTA4Q4uiRlAbuEb9u1VDo","W5KUHAUzDtDf33d6OkmVjuOFfnrqYNHAPvEo7oTN");
    }
}
