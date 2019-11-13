package vn.edu.usth.weather;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i("log", "This is Create");
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
