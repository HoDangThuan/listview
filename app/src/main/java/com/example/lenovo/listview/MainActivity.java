package com.example.lenovo.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDienThoai;
    ArrayList<DienThoai> arrayDienThoai;
    AdapterDienThoai adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter=new AdapterDienThoai(this,R.layout.line_dien_thoai, arrayDienThoai);
        lvDienThoai.setAdapter(adapter);
    }

    private void AnhXa() {
        lvDienThoai= (ListView) findViewById(R.id.listviewDienThoai);
        arrayDienThoai=new ArrayList<>();

        arrayDienThoai.add(new DienThoai("Sony Xperia XZ Premium","599$ - LCD 5.5 inch - Hè 2018",R.drawable.dienthoai01,R.drawable.icon01));
        arrayDienThoai.add(new DienThoai("Xiaomi Mi Mix 3","499$ - Full HD 6.4 inch - Thu 2018",R.drawable.dienthoai02,R.drawable.icon02));
        arrayDienThoai.add(new DienThoai("Nokia 9","549$ - OLED 5.5 inch - Xuân 2018",R.drawable.dienthoai03,R.drawable.icon03));
        arrayDienThoai.add(new DienThoai("Huawei P11","569$ - IPS LCD 5.8 inch - Xuân/Thu 2018",R.drawable.dienthoai04,R.drawable.icon04));

        arrayDienThoai.add(new DienThoai("Sony Xperia XZ Premium","599$ - LCD 5.5 inch - Hè 2018",R.drawable.dienthoai01,R.drawable.icon01));
        arrayDienThoai.add(new DienThoai("Xiaomi Mi Mix 3","499$ - Full HD 6.4 inch - Thu 2018",R.drawable.dienthoai02,R.drawable.icon02));
        arrayDienThoai.add(new DienThoai("Nokia 9","549$ - OLED 5.5 inch - Xuân 2018",R.drawable.dienthoai03,R.drawable.icon03));
        arrayDienThoai.add(new DienThoai("Huawei P11","569$ - IPS LCD 5.8 inch - Xuân/Thu 2018",R.drawable.dienthoai04,R.drawable.icon04));
    }
}
