package thanakit.ruts.ac.th.lab1_basicss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tempcal extends AppCompatActivity {
    private String Tem, Unit, Answer;
    private TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempcal);

        Intent intent = getIntent();
        Tem = intent.getExtras().getString("Tem");
        Unit = intent.getExtras().getString("Unit");
        Answer  = intent.getExtras().getString("Answer");

        txt1 = (TextView)findViewById(R.id.txtget);
        txt2 = (TextView)findViewById(R.id.txttemp);
        txt3 = (TextView)findViewById(R.id.txtresult);


        txt1.setText(getIntent().getStringExtra("Tem"));
        txt2.setText(getIntent().getStringExtra("Unit"));
        txt3.setText(getIntent().getStringExtra("Answer"));


    }

}
