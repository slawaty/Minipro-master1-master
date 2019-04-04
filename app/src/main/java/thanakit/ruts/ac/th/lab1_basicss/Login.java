package thanakit.ruts.ac.th.lab1_basicss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

        public class Login extends AppCompatActivity {
            Button btnNext;
            EditText username, password;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);

                username = (EditText)findViewById(R.id.edituser);
                password = (EditText)findViewById(R.id.editpass);


                btnNext = (Button)findViewById(R.id.btnnext);
                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Login.this, Second.class);
                        startActivity(intent);

                        intent.putExtra("name", username.getText().toString());
                        intent.putExtra("passwd", password.getText().toString());


                        startActivity(intent);
                    }
                });

            }


    }

