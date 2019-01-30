package com.example.tugasfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugasfragment.Fragment.Fragment1;
import com.example.tugasfragment.Fragment.Fragment2;
import com.example.tugasfragment.Fragment.Fragment3;
import com.example.tugasfragment.Fragment.Fragment4;
import com.example.tugasfragment.Fragment.Fragment5;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spKota;
    TextView tvPilih;
    FragmentManager fm;
    private String[] lisFragment = {
            "-Fragment-", "Fragment1", "Fragment2", "Fragment3", "Fragment4", "Fragment5"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPilih = findViewById(R.id.tv_pilih);
        spKota = findViewById(R.id.sp_btn);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lisFragment);
        spKota.setAdapter(adapter);
        spKota.setOnItemSelectedListener(this);

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        fm = getSupportFragmentManager();
        tvPilih.setText(lisFragment[position]);
        switch (position){

            case 0:
                Toast.makeText(this, "hai", Toast.LENGTH_SHORT).show();
                fm.beginTransaction()
                        .add(R.id.container, new Fragment())
                        .commit();
                break;
            case 1:
                Toast.makeText(this, "saya", Toast.LENGTH_SHORT).show();
                fm.beginTransaction()
                        .add(R.id.container, new Fragment1())
                        .commit();
                break;
            case 2:
                Toast.makeText(this, "habib", Toast.LENGTH_SHORT).show();
                fm.beginTransaction()
                        .add(R.id.container, new Fragment2())
                        .commit();
                break;
            case 3:
                Toast.makeText(this, "kamu", Toast.LENGTH_SHORT).show();
                fm.beginTransaction()
                        .add(R.id.container, new Fragment3())
                        .commit();
                break;
            case 4:
                Toast.makeText(this, "siapa", Toast.LENGTH_SHORT).show();
                fm.beginTransaction()
                        .add(R.id.container, new Fragment4())
                        .commit();
                break;
            case 5:
                Toast.makeText(this, "???", Toast.LENGTH_SHORT).show();
                fm.beginTransaction()
                        .add(R.id.container, new Fragment5())
                        .commit();
                break;

        }




    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        tvPilih.setText("");


    }

}
