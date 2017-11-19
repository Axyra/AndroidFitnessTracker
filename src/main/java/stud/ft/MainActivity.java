package stud.ft;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.google.inject.Inject;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.SystemService;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.roboguice.annotations.RoboGuice;

import java.util.Calendar;
import java.util.Date;

import stud.ft.dal.StepCount;
import stud.ft.dal.StepCountDao;
import stud.ft.services.Greeter;

@EActivity(R.layout.main_activity)
@RoboGuice
public class MainActivity extends AppCompatActivity implements SensorEventListener {

    @SystemService
    SensorManager manager;

    @Inject
    Greeter greeter;

    @ViewById(R.id.accelerometerValues)
    TextView textView;

    @Inject
    StepCountDao stepCountDao;

    @Override
    protected void onResume() {
        super.onResume();

        Sensor acc = manager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        manager.registerListener(this, acc, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();

        manager.unregisterListener(this);
    }

    @Click(R.id.makeStepBtn)
    public void onMakeStepClick() {
        greeter.Greet("You'r brilliant! You made a step! GREAT!");
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] values = sensorEvent.values;
        String text = "Accelerometer[x =" + Float.toString(values[0]) + "; y = " + Float.toString(values[1]) + "; z = " + Float.toString(values[2]) +"]";
        textView.setText(text);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
