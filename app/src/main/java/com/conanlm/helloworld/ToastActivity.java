package com.conanlm.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.conanlm.helloworld.util.ToastUtil;

public class ToastActivity extends AppCompatActivity {
    private Button mBtnToast1,mBtnToast2,mBtnToast3,mBtnToast4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mBtnToast1=findViewById(R.id.btn_toast_1);
        mBtnToast2=findViewById(R.id.btn_toast_2);
        mBtnToast3=findViewById(R.id.btn_toast_3);
        mBtnToast4=findViewById(R.id.btn_toast_4);
        OnClick onClick=new OnClick();
        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
        mBtnToast3.setOnClickListener(onClick);
        mBtnToast4.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_toast_1:
                    Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_toast_2:
                    Toast toastCenter=Toast.makeText(getApplicationContext(),"剧中",Toast.LENGTH_SHORT);
                    toastCenter.setGravity(Gravity.CENTER,0,0);
                    toastCenter.show();
                    break;
                case R.id.btn_toast_3:
                    Toast toastCustom=new Toast(getApplicationContext());
                    LayoutInflater inflater=LayoutInflater.from(ToastActivity.this);
                    View view=inflater.inflate(R.layout.layou_toast,null);
                    ImageView imageView=view.findViewById(R.id.iv_toast);
                    TextView textView=view.findViewById(R.id.tv_toast);
                    imageView.setImageResource(R.drawable.test001);
                    textView.setText("自定义Toast");
                    toastCustom.setView(view);
                    toastCustom.setDuration(Toast.LENGTH_LONG);
                    toastCustom.show();
                    break;
                case R.id.btn_toast_4:
                    ToastUtil.showMsg(getApplicationContext(),"包装过的");
                    break;

            }

        }
    }
}
