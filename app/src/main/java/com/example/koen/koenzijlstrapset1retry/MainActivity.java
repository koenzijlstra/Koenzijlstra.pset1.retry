package com.example.koen.koenzijlstrapset1retry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void setvisibility (View view){

        // boolean, true if checked
        boolean checked = ((CheckBox) view).isChecked();

        // what boxes are clicked
        switch (view.getId()){
            case R.id.armscheck:
                if (checked)
                    findViewById(R.id.arms).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.arms).setVisibility(view.INVISIBLE);
        }

    }

}
