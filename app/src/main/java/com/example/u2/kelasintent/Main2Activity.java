package com.example.u2.kelasintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String username, sandi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        terimaExtra();
        terimaBundle();
    }

    public void terimaExtra(){
//        intent with extra
        Intent intent = getIntent();
        username = intent.getStringExtra("nama");
        sandi = intent.getStringExtra("sandi");
//        get int --> getIntExtra();

        TextView tv1 = (TextView) findViewById(R.id.textview1);
        TextView tv2 = (TextView) findViewById(R.id.textview2);

        tv1.setText(username+"");
        tv2.setText(sandi+"");
    }
    public void terimaBundle(){
//        intent with bundle
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("username");
        String sandi = bundle.getString("sandi");

        TextView tv1 = (TextView) findViewById(R.id.textview1);
        TextView tv2 = (TextView) findViewById(R.id.textview2);

        tv1.setText(username+"");
        tv2.setText(sandi+"");
    }
}
