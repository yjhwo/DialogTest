package com.estsoft.dialogtest;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        Dialog dig = new Dialog(this);

        dig.setContentView(R.layout.dialog_test);           // inflation
        dig.setTitle("Dialog Test");

        dig.show();

    }

}
