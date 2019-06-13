package com.joh.demo.scrowviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * RecyclerView嵌套RecyclerView
 * 
 * @author : Joh_hz
 * @date : 2019/5/24 14:53
 */
public class NestOneActivity extends AppCompatActivity {

    @BindView(R.id.recycle_view)
    RecyclerView recycleView;

    ImageView iv;

    ListAdapter mAdapter;
    List<String> mLiatData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nest_one);
        ButterKnife.bind(this);

        for (int i = 0; i < 10; i++) {
            mLiatData.add(i + "");
        }

        recycleView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new ListAdapter(this, mLiatData);
        recycleView.setAdapter(mAdapter);

        View headerView = getLayoutInflater().inflate(R.layout.item_layout_header, (ViewGroup) recycleView.getParent(), false);
        iv = headerView.findViewById(R.id.iv_img);
        iv.setImageResource(R.mipmap.img1);
//        mAdapter.addHeaderView(headerView);

    }


}
