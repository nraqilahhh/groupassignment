package com.example.mymapsapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity2 extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;
    TextView profileText;
    Button button8, button9, button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);
        auth = FirebaseAuth.getInstance();
        profileText = (TextView)findViewById(R.id.textView3);

        user = auth.getCurrentUser();
        profileText.setText(user.getEmail());

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(view -> {
                    Intent intent = new Intent(this, MapsActivity.class);
                    startActivity(intent);
        });

        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(view -> {
                    Intent intent = new Intent(this, NearbyMapsActivity.class);
                    startActivity(intent);
        });

        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(view -> {
            Intent intent = new Intent(this, AboutUsActivity.class);
            startActivity(intent);
        });
    }

    public void signout(View v){
        auth.signOut();
        finish();
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}