package com.conanlm.helloworld.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.conanlm.helloworld.R;

public class LinearRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRvmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);
        mRvmain=findViewById(R.id.rv_main);
        mRvmain.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));
        mRvmain.setAdapter(new LinearAdapter(LinearRecyclerViewActivity.this));
    }
}
