package smile.khaled.mohamed.daggerapp;

import android.util.Log;

import javax.inject.Inject;

public class Fight {

    private Dog dog;
    private Cat cat;

    @Inject
    public Fight(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public void eat(){
        dog.eat();
        cat.eat();
    }

    public void drink(){
        dog.drink();
        cat.drink();
    }
}
