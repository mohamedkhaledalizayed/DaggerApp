package smile.khaled.mohamed.daggerapp;

import android.util.Log;

import javax.inject.Inject;

public class Dog implements Animal {

    @Inject
    public Dog() {
    }

    @Override
    public void eat() {
        Log.e("Dog", getClass().getName()+" eat");
    }

    @Override
    public void drink() {
        Log.e("Dog", getClass().getName()+" drink");
    }


}
