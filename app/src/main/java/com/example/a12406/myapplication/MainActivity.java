package com.example.a12406.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                TextView textView = (TextView) findViewById(R.id.id_text_hello);
                textView.setText("按钮被点击");
                break;
        }

    }
}
