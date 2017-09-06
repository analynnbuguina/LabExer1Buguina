package com.analynn.labexer08312017;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText raTotal, finalGradeTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        raTotal = (EditText)findViewById(R.id.raTotal);
        finalGradeTotal = (EditText)findViewById(R.id.finalGradeTotal);

        raTotal.setText(getIntent().getStringExtra("raTotal"));
        finalGradeTotal.setText(getIntent().getStringExtra("finalGradeTotal"));
    }

    public void onBack(View view){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
