package com.example.lenovo.listview;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lenovo on 06-Mar-18.
 */

public class AdapterDienThoai extends BaseAdapter {
    private Context context;
    private int layout;
    private List<DienThoai> listDienThoai;

    public AdapterDienThoai(Context context, int layout, List<DienThoai> listDienThoai) {
        this.context = context;
        this.layout = layout;
        this.listDienThoai = listDienThoai;
    }

    @Override
    public int getCount() {
        return listDienThoai.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(layout,null);

        // ánh xạ convertView
        TextView txtTen= (TextView) convertView.findViewById(R.id.textViewTen);
        TextView txtMoTa= (TextView) convertView.findViewById(R.id.textViewMoTa);
        ImageView imgHinh= (ImageView) convertView.findViewById(R.id.imageViewHinh);
        ImageView imgIcon= (ImageView) convertView.findViewById(R.id.imageViewIcon);

        // gán giá trị
        DienThoai dienThoai=listDienThoai.get(position);
        txtTen.setText(dienThoai.getTen());
        txtMoTa.setText(dienThoai.getMota());
        imgHinh.setImageResource(dienThoai.getHinh());
        imgIcon.setImageResource(dienThoai.getIcon());

        return convertView;
    }
}
