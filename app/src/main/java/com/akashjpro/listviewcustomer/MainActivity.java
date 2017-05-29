package com.akashjpro.listviewcustomer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvTraiCay;
    List<TraiCay> mangTraiCay;
    TraiCayAdapter traiCayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTraiCay = (ListView) findViewById(R.id.listViewTraiCay);

        addMangTraiCay();

        traiCayAdapter = new TraiCayAdapter(MainActivity.this, R.layout.dong_trai_cay, mangTraiCay);

        lvTraiCay.setAdapter(traiCayAdapter);
    }

    private void addMangTraiCay() {
        mangTraiCay = new ArrayList<TraiCay>();
        mangTraiCay.add(new TraiCay(R.drawable.traicay1, "Trai cay 1", "Trai cay 1"));
        mangTraiCay.add(new TraiCay(R.drawable.traicay2, "Trai cay 2", "Trai cay 2"));
        mangTraiCay.add(new TraiCay(R.drawable.traicay3, "Trai cay 3", "Trai cay 3"));
        mangTraiCay.add(new TraiCay(R.drawable.traicay4, "Trai cay 4", "Trai cay 4"));
        mangTraiCay.add(new TraiCay(R.drawable.traicay5, "Trai cay 5", "Trai cay 5"));
    }
}
