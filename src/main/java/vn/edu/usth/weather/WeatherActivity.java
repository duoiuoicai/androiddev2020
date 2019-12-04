package vn.edu.usth.weather;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.LayoutInflater;

public class WeatherActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weather);
        Log.i("log", "This is Create");
        // Create a new Fragment to be placed in the activity layout
        ForecastFragment firstFragment = new ForecastFragment();
// Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("log","This is Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("log", "This is Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("log","This is Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("log", "This is Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("log", "This is Resume");
    }
}
