package application;

import android.app.Application;
import android.content.Context;

import com.digital.gkpundit.data.ApplicationData;

public class gkpundit extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();
        gkpundit.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return gkpundit.context;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ApplicationData.getSharedInstance().getDbManager().close();
    }
}

/*
* home page:
*
*  popup designs in question screen
*
*
* puch notification : image
* share questions
* share app content
*
*
*
* collect Q&A
*
* MOtivation sentance
*
*
*
* inperchage app implement
*
*
* at last remove test id from admob ads
*
*
*
*
* */