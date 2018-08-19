package com.conanlm.helloworld.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.conanlm.helloworld.R;

/**
 * 作者  $USER_NAME
 * 时间  2018/8/17 13:31
 */
public class LinearAdapter extends RecyclerView.Adapter <LinearAdapter.LinearViewHolder>{
    private Context mContext;
    private OnItemClickListener mListener;
    public LinearAdapter(Context context,OnItemClickListener listener){
        this.mContext=context;
        this.mListener=listener;
    }
    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder viewHolder, final int i) {
        viewHolder.textView.setText("Hello World");
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
        private TextView textView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_title);

        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
