package smile.khaled.mohamed.daggerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.Component;

public class MainActivity extends AppCompatActivity {

    @Component
    interface FightComponent{
        Fight getFight();
        Dog getDog();
        Cat getCat();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FightComponent component = DaggerMainActivity_FightComponent.create();
        Fight fight = component.getFight();
        fight.eat();
        fight.drink();

    }
}
