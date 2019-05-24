package com.joh.demo.scrowviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 嵌套滑动案例
 *
 * @author : Joh_hz
 * @date : 2019/5/24 14:49
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * RecyclerView嵌套RecyclerView
     */
    @OnClick(R.id.btn_nest_one)
    public void nest_one() {
        startActivity(new Intent(getApplicationContext(), NestOneActivity.class));
    }

    /**
     * ScrollView嵌套RecyclerView
     */
    @OnClick(R.id.btn_nest_two)
    public void nest_two() {
        startActivity(new Intent(getApplicationContext(), NestTwoActivity.class));
    }
}
