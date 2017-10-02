package stud.ft.services;

import android.content.Context;
import android.widget.Toast;

import com.google.inject.Inject;

public class GreeterImpl implements Greeter {

    @Inject
    protected Context applicationContext;

    @Override
    public void Greet(String greeting) {
        Toast.makeText(applicationContext, greeting, Toast.LENGTH_SHORT).show();
    }
}
