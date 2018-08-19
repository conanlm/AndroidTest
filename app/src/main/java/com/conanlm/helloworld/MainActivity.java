package com.conanlm.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.conanlm.helloworld.gridview.GridViewActivity;
import com.conanlm.helloworld.listview.ListViewActivity;
import com.conanlm.helloworld.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {


    private Button mbtnTextView;
    private Button mBtnButton;
    private Button mBtnEdittext;
    private Button mbtnRadioButton;
    private Button mbtnCheckBox;
    private Button mbtnImageView;
    private Button mbtnListView;
    private Button mbtnGridView;
    private Button mBtnRv;
    private Button mBtnWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnTextView =findViewById(R.id.btn_textview);
//        mbtnTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent =new Intent(MainActivity.this,TextViewActivity.class);
//                startActivity(intent);
//            }
//        });

        mBtnButton =findViewById(R.id.btn_button);
//        mBtnButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//                Intent intent =new Intent(MainActivity.this,ButtonActivity.class);
//                startActivity(intent);
//            }
//
//        });
        mBtnEdittext=findViewById(R.id.btn_edittext);
//        mBtnEdittext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(MainActivity.this, EditTextActivity.class);
//                startActivity(intent);
//            }
//        });

        mbtnRadioButton=findViewById(R.id.btn_radiobutton);
        mbtnCheckBox=findViewById(R.id.btn_checkbox);
        mbtnImageView=findViewById(R.id.btn_imageview);
        mbtnListView=findViewById(R.id.btn_listview);
        mbtnGridView=findViewById(R.id.btn_gridview);
        mBtnRv=findViewById(R.id.btn_recyclerview);
        mBtnWebView=findViewById(R.id.btn_webview);
        setListeners();
    }

    private void setListeners(){
        OnClick onClick=new OnClick();
        mbtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEdittext.setOnClickListener(onClick);
        mbtnRadioButton.setOnClickListener(onClick);
        mbtnCheckBox.setOnClickListener(onClick);
        mbtnImageView.setOnClickListener(onClick);
        mbtnListView.setOnClickListener(onClick);
        mbtnGridView.setOnClickListener(onClick);
        mBtnRv.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.btn_textview:
                    //跳转到TextView界面
                    intent =new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    //跳转到ButtonActivity界面
                    intent =new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    //跳转到EditTextActivity界面
                    intent =new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    //跳转到RadioButtonActivity界面
                    intent =new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    //跳转到RadioButtonActivity界面
                    intent =new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    //跳转到RadioButtonActivity界面
                    intent =new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    //跳转到RadioButtonActivity界面
                    intent =new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    //跳转到RadioButtonActivity界面
                    intent =new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_recyclerview:
                    //跳转到RadioButtonActivity界面
                    intent =new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.btn_webview:
                    //跳转到RadioButtonActivity界面
                    intent =new Intent(MainActivity.this, WebViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }

}
