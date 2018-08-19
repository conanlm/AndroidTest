package com.conanlm.helloworld.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.conanlm.helloworld.R;

/**
 * 作者  conanlm
 * 时间  2018/8/19 09:28
 */
public class StaggeredGridAdapter extends RecyclerView.Adapter <StaggeredGridAdapter.LinearViewHolder>{
    private Context mContext;
    private OnItemClickListener mListener;
    public StaggeredGridAdapter(Context context, OnItemClickListener listener){
        this.mContext=context;
        this.mListener=listener;
    }
    @NonNull
    @Override
    public StaggeredGridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_staggeredgrid_recyclerview_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredGridAdapter.LinearViewHolder viewHolder, final int i) {
        if(i % 2!=0){
            Glide.with(mContext).load("https://i.loli.net/2018/08/01/5b611f5ad7a6d.jpg").into(viewHolder.imageView);
            //viewHolder.imageView.setImageResource();
        }else {
            Glide.with(mContext).load("http://ww1.sinaimg.cn/large/a07654b6gy1fpwicnhropj23401r0hdt.jpg").into(viewHolder.imageView);
            //viewHolder.imageView.setImageResource();
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(mContext,"点击"+i,Toast.LENGTH_SHORT).show();
                mListener.onClick(i);
            }
        });
//        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                return false;
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv);

        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
