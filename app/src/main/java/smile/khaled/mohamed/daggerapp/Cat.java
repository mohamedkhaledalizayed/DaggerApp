package smile.khaled.mohamed.daggerapp;

import android.util.Log;

import javax.inject.Inject;

public class Cat implements Animal {

    @Inject
    public Cat() {
    }

    @Override
    public void eat() {
        Log.e("Cat", getClass().getName()+" eat");
    }

    @Override
    public void drink() {
        Log.e("Cat", getClass().getName()+" drink");
    }
}
