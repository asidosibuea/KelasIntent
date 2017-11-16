package com.example.u2.kelasintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername, edtPass;
    private String username, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kirimExtra(View view){
        edtUsername = (EditText) findViewById(R.id.username);
        edtPass = (EditText) findViewById(R.id.pass);

        username = edtUsername.getText().toString();
        pass = edtPass.getText().toString();

//intent with extra
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("nama",username);
        intent.putExtra("sandi",pass);
        startActivity(intent);


    }

    public void kirimBundle(View view){
        edtUsername = (EditText) findViewById(R.id.username);
        edtPass = (EditText) findViewById(R.id.pass);

        username = edtUsername.getText().toString();
        pass = edtPass.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("username",username);
        bundle.putString("sandi", pass);
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
