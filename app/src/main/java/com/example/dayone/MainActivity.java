package com.example.dayone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    public static String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Setting xml environment in java
        editText=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=editText.getText().toString().trim();
                Toast.makeText(MainActivity.this, "Hi You are here "+s, Toast.LENGTH_SHORT).show();
                textView.setText(s);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    textView.setGravity(View.TEXT_ALIGNMENT_CENTER);
                }
                textView.setAllCaps(true);
                textView.setTextSize(24);
                textView.setTextColor(getResources().getColor(R.color.colorAccent));
                Intent intent=new Intent(MainActivity.this,Hello.class);
                startActivity(intent);
            }
        });
    }
}
