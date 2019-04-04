package thanakit.ruts.ac.th.lab1_basicss;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class Four extends AppCompatActivity {
    public FirebaseDatabase firebaseDatabase;
    public DatabaseReference REfer, REfer1, REfer2;
    public String date;
    public TextView textname,textsensor, textsensor1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        firebaseDatabase = FirebaseDatabase.getInstance();

        REfer = firebaseDatabase.getReference();
        REfer1 = firebaseDatabase.getReference();
        REfer2 = firebaseDatabase.getReference();

        textname = findViewById(R.id.txtname);
        textsensor = findViewById(R.id.txtsensor);
        textsensor1 = findViewById(R.id.txtsensor1);


        REfer.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Map map = (Map) dataSnapshot.getValue();
                date = String.valueOf(map.get("Name"));
                textname.setText(date);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        REfer1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Map map = (Map) dataSnapshot.getValue();
                date = String.valueOf(map.get("LightSensor"));
                textsensor.setText(date);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        REfer2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Map map = (Map) dataSnapshot.getValue();
                date = String.valueOf(map.get("LightSensor1"));
                textsensor1.setText(date);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

}