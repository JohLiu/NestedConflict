package com.joh.demo.scrowviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * ScrollView嵌套RecyclerView
 * 
 * @author : Joh_hz
 * @date : 2019/5/24 14:53
 */
public class NestTwoActivity extends AppCompatActivity {

    @BindView(R.id.recycle_view)
    RecyclerView recycleView;

    ListAdapter mAdapter;
    List<String> mLiatData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nest_two);
        ButterKnife.bind(this);

        for (int i = 0; i < 10; i++) {
            mLiatData.add(i + "");
        }

        recycleView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new ListAdapter(this, mLiatData);
        recycleView.setAdapter(mAdapter);

    }

}
