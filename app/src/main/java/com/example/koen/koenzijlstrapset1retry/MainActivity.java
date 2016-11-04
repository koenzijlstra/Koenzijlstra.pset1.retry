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

            // arms
            case R.id.armscheck:

                if (checked)
                    findViewById(R.id.arms).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.arms).setVisibility(view.INVISIBLE);
                break;

            // eyes
            case R.id.eyescheck:
                if (checked)
                    findViewById(R.id.eyes).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.eyes).setVisibility(view.INVISIBLE);
                break;

             // mouth
            case R.id.mouthcheck:
                if (checked)
                    findViewById(R.id.mouth).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.mouth).setVisibility(view.INVISIBLE);
                break;
            // eyebrows
            case R.id.eyebrowscheck:
                if (checked)
                    findViewById(R.id.eyebrows).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.eyebrows).setVisibility(view.INVISIBLE);
                break;
            // shoes
            case R.id.shoescheck:
                if (checked)
                    findViewById(R.id.shoes).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.shoes).setVisibility(view.INVISIBLE);
                break;
            // ears
            case R.id.earscheck:
                if (checked)
                    findViewById(R.id.ears).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.ears).setVisibility(view.INVISIBLE);
                break;
            
                // hat
            case R.id.hatcheck:
                if (checked)
                    findViewById(R.id.hat).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.hat).setVisibility(view.INVISIBLE);
                break;
            // nose
            case R.id.nosecheck:
                if (checked)
                    findViewById(R.id.nose).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.nose).setVisibility(view.INVISIBLE);
                break;

            // mustache
            case R.id.mustachecheck:
                if (checked)
                    findViewById(R.id.mustache).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.mustache).setVisibility(view.INVISIBLE);
                break;

            // glasses
            case R.id.glassescheck:
                if (checked)
                    findViewById(R.id.glasses).setVisibility(view.VISIBLE);
                else
                    findViewById(R.id.glasses).setVisibility(view.INVISIBLE);
                break;

        }

    }
}
