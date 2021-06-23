package com.example.tuition_bank;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Searching extends AppCompatActivity {
    EditText LocSearch , ClassSearch, SubSearch;
    String locSearch1, classSearch1, subSearch1;
    Button ref_to_tuilist1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_searching);
        LocSearch= (EditText)findViewById(R.id.locSearch);
        ClassSearch = findViewById(R.id.classSearch);
        SubSearch = findViewById(R.id.subSearch);

        ref_to_tuilist1= (Button)findViewById(R.id.ref_to_tuilist);

        ref_to_tuilist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lets_convert();
                Intent intent= new Intent(Searching.this,tuition_lists.class );
                intent.putExtra("loc", locSearch1);
                intent.putExtra("class", classSearch1);
                intent.putExtra("sub", subSearch1);
                startActivity(intent);
            }
        });
    }
    public void lets_convert(){
        locSearch1=  LocSearch.getText().toString();
        classSearch1= ClassSearch.getText().toString();
        subSearch1 = SubSearch.getText().toString();
    }
}