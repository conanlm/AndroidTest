package com.conanlm.helloworld.listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.conanlm.helloworld.R;

public class MyListAdapter extends BaseAdapter {

    private  Context mContext;
    private LayoutInflater mLayoutInflater;
    MyListAdapter(Context context){
        this.mContext=context;
        mLayoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static  class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle,tvTime,tvContent;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView == null){
            convertView=mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder=new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.iv);
            holder.tvTime=convertView.findViewById(R.id.tv_time);
            holder.tvTitle=convertView.findViewById(R.id.tv_title);
            holder.tvContent=convertView.findViewById(R.id.tv_contect);
            convertView.setTag(holder);

        }
        else {
            holder =(ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.tvTitle.setText("这是标题");
        holder.tvTime.setText("8102");
        holder.tvContent.setText("这是内容");
        Glide.with(mContext).load("https://i.loli.net/2018/08/01/5b611f5ad7a6d.jpg").into(holder.imageView);

        return convertView;
    }
}
