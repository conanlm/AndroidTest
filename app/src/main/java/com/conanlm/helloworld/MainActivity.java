package com.conanlm.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnUi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnUi=findViewById(R.id.btn_ui);
        OnClick onClick=new OnClick();
        mBtnUi.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener{
        public void onClick (View v){
            Intent intent=null;
            switch (v.getId()){
                case R.id.btn_ui:
                    intent=new Intent(MainActivity.this,UIActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
