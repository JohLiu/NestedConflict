package com.joh.demo.scrowviewdemo;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public ListAdapter(Context context, List<String> data) {
        super(R.layout.item_layout, data);
        this.mContext = context;
    }

    @Override
    protected void convert(final BaseViewHolder helper, String item) {
        List<String> mListImg = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            mListImg.add(i + "");
        }
        RecyclerView rvImg = helper.getView(R.id.rv_img);
        rvImg.setLayoutManager(new GridLayoutManager(mContext, 3));
        GrideAdapter adapter = new GrideAdapter(mContext, mListImg);
        rvImg.setAdapter(adapter);

    }

}
