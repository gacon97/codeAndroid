package com.example.moblie_tmdt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class link_adapter extends BaseAdapter {

    private int layout;
    private List<link_application> link_application;
    private Context context;

    public link_adapter(int layout, List<com.example.moblie_tmdt.link_application> link_application, Context context) {
        this.layout = layout;
        this.link_application = link_application;
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public List<com.example.moblie_tmdt.link_application> getLink_application() {
        return link_application;
    }

    public void setLink_application(List<com.example.moblie_tmdt.link_application> link_application) {
        this.link_application = link_application;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return link_application.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        TextView name = (TextView) convertView.findViewById(R.id.link_name);
        ImageView image = (ImageView) convertView.findViewById(R.id.link_image);

        link_application la= (link_application) link_application.get(position);
        name.setText(la.getName());
        image.setImageResource(la.getImage());
        return convertView;
    }
}
