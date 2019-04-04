package thanakit.ruts.ac.th.lab1_basicss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    ImageButton btnh, btnn;
    Button btnt ,btnNext;
    TextView username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        username = (TextView)findViewById(R.id.textname);
        password = (TextView)findViewById(R.id.textpass);



        btnh = (ImageButton)findViewById(R.id.imgbtnh);
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Profile.class);
                startActivity(intent);
            }
        });

        btnt = (Button)findViewById(R.id.btntemp);
        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Temp.class);
                startActivity(intent);
            }
        });

        btnt = (Button)findViewById(R.id.btntemp2);
        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Three.class);
                startActivity(intent);
            }
        });

        btnt = (Button)findViewById(R.id.btnsw);
        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Four.class);
                startActivity(intent);
            }
        });

        username = (TextView)findViewById(R.id.textname);
        password = (TextView)findViewById(R.id.textpass);


        username.setText(getIntent().getStringExtra("name"));
        password.setText(getIntent().getStringExtra("passwd"));


    }
}
