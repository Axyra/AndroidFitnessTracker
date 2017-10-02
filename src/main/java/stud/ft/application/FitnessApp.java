package stud.ft.application;

import android.app.Application;

import org.androidannotations.annotations.EApplication;

import roboguice.RoboGuice;

@EApplication
public class FitnessApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RoboGuice.setUseAnnotationDatabases(false);
    }
}
