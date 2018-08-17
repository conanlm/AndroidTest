package com.conanlm.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.conanlm.helloworld.R;

/**
 * 作者  Administrator
 * 时间  ${DATA}
 */
public class MyGridViewAdapter extends BaseAdapter {

    private Context mContest;
    private LayoutInflater mLayoutInflater;
    public MyGridViewAdapter(Context context){
        this.mContest=context;
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

    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=mLayoutInflater.inflate(R.layout.layout_grid_item,null);
            holder=new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.iv_grid);
            holder.textView=convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);

        }else {
            holder=(ViewHolder) convertView.getTag();
        }
        holder.textView.setText("hua");
        Glide.with(mContest).load("http://wx2.sinaimg.cn/large/535b21d7gy1fruxia6yikj22bc1g3ner.jpg").into(holder.imageView);
        return convertView;
    }
}
