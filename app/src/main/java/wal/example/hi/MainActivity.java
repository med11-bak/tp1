    package wal.example.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1= findViewById(R.id.b1);
        final TextView t1 = findViewById(R.id.t1);
        final EditText e1 = findViewById(R.id.e1);
        
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                if(name.isEmpty())
                    t1.setText("please type your name");
                else
                t1.setText("Hello " + name);
                e1.setText("");
            }
        })  ;
    }

}