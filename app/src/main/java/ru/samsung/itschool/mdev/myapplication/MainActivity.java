package ru.samsung.itschool.mdev.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Bundle b;

    @Override
    protected void onStart() {
        // выполняется до прорисовки User Interface (onCreate)
        super.onStart();
        Log.d("RRRRR","onStart()");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Инициализация активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRRRR","onCreate()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        //сохранение состояния
       outState.putString("ttt","123");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        // получения состояния
        String value = savedInstanceState.getString("ttt");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStop() {
        // выполняется перед выходом из видимого состояние User Interface
        super.onStop();
        Log.d("RRRRR","onStop()");
    }

    @Override
    protected void onResume() {
        // восстановление активности
        super.onResume();
        Log.d("RRRRR","onResume()");
    }

    @Override
    protected void onDestroy() {
        // уничтожение активности - окончание работы актвности
        super.onDestroy();
        Log.d("RRRRR","onDestroy()");
    }

    @Override
    protected void onRestart() {
        // вызывает после того, как активность была остановлена и снова и была запущена
        super.onRestart();
        Log.d("RRRRR","onRestart()");
    }

    @Override
    protected void onPause() {
        // когда пользователь решает перейти к работе с новы окном (свертывание активности)
        super.onPause();
        Log.d("RRRRR","onPause()");
    }



}