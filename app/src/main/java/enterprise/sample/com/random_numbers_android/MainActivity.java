package enterprise.sample.com.random_numbers_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView superposition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        superposition  = (TextView) findViewById(R.id.superposition);
        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                superposition.setText(Integer.toString(rollDice()));
               // Toast.makeText( getApplicationContext(),Integer.toString(rollDice()) , Toast.LENGTH_SHORT).show();
            }
        });


    }

    public int rollDice(){
        // random num between 0 and (almost) 1
        double randomNumber=Math.random();

        // change range to 0 to (almost) 6
        randomNumber=randomNumber*6;

        // shift range up one
        randomNumber=randomNumber+1;

        // cast to integer (ignore decimal part)
        // ex. 6.998 becomes 6
        int randomInt=(int)randomNumber;

        // return statement
        return randomInt;
    }


    }


