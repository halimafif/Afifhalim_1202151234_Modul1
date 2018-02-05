package com.afifhalim.tpstudycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText jumlah;
    public void onEatbus(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        Bundle b = new Bundle();
        jumlah = (EditText) findViewById(R.id.txt_jumlah);
        String jml = jumlah.getText().toString();
        int harga=Integer.parseInt(jml)*50000;

        b.putString("resto","EATBUS");
        b.putString("jumlah",jumlah.getText().toString());
        b.putString("harga",String.valueOf(harga));
        intent.putExtras(b);
        Toast.makeText(this, "Jangan makan malam disini,uang kamu tidak cukup", Toast.LENGTH_LONG).show();


        startActivity(intent);
    }

    public void onAbnormal(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        Bundle b = new Bundle();
        jumlah = (EditText) findViewById(R.id.txt_jumlah);
        String jml = jumlah.getText().toString();
        int harga=Integer.parseInt(jml)*30000;

        b.putString("resto","ABNORMAL");
        b.putString("jumlah",jumlah.getText().toString());
        b.putString("harga",String.valueOf(harga));
        intent.putExtras(b);

        Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
