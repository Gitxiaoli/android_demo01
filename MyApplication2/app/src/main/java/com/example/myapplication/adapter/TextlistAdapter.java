package com.example.myapplication.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class TextlistAdapter extends BaseAdapter {
    private List<RecivDate.PhotoDate> Dates;
    public TextlistAdapter(List<RecivDate.PhotoDate> dates) {
        Dates = dates;
    }
    @Override
    public int getCount() {
        if (Dates == null) return 0;
        return Dates.size();//数据的长度
    }

    @Override
    public Object getItem(int position) {
        return Dates.get(position);
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
