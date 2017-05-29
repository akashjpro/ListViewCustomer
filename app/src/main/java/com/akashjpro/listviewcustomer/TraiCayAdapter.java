package com.akashjpro.listviewcustomer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Akashjpro on 9/1/2016.
 */
public class TraiCayAdapter extends BaseAdapter {

    Context myContext;
    int myLayout;
    List<TraiCay> mangTraiCay;

    public TraiCayAdapter(Context myContext, int myLayout, List<TraiCay> mangTraiCay) {
        this.mangTraiCay = mangTraiCay;
        this.myContext = myContext;
        this.myLayout = myLayout;
    }

    @Override
    public int getCount() {
        return mangTraiCay.size();
    }

    @Override
    public Object getItem(int i) {
        return mangTraiCay.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class ViewHolder{
        TextView txtTen;
        TextView txtMoTa;
        ImageView imgHinh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) this.myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ViewHolder viewHolder = new ViewHolder();

        View rowView = view;

        //nếu chưa có thì ánh xạ
        if(rowView==null){
            rowView = inflater.inflate(this.myLayout, null);
            viewHolder.txtTen = (TextView) rowView.findViewById(R.id.textViewTen);
            viewHolder.txtMoTa = (TextView) rowView.findViewById(R.id.textViewMoTa);
            viewHolder.imgHinh = (ImageView) rowView.findViewById(R.id.imageView);

            rowView.setTag(viewHolder);
        }
        //Ánh xạ rồi chỉ lấy lại
        else {
            viewHolder = (ViewHolder) rowView.getTag();
        }



        viewHolder.txtTen.setText(mangTraiCay.get(i).getTen());
        viewHolder.txtMoTa.setText(mangTraiCay.get(i).getMoTa());
        viewHolder.imgHinh.setImageResource(mangTraiCay.get(i).getHinhTraiCay());

        return rowView;
    }

//    public View getView(int i, View view, ViewGroup viewGroup) {
//
//        LayoutInflater inflater = (LayoutInflater) this.myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        view = inflater.inflate(this.myLayout, null);
//
//        TextView txtTen = (TextView) view.findViewById(R.id.textViewTen);
//        TextView txtMoTa = (TextView) view.findViewById(R.id.textViewMoTa);
//        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageView);
//
//        txtTen.setText(mangTraiCay.get(i).getTen());
//        txtMoTa.setText(mangTraiCay.get(i).getMoTa());
//        imgHinh.setImageResource(mangTraiCay.get(i).getHinhTraiCay());
//
//        return view;
//    }
}
