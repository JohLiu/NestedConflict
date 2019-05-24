package com.joh.demo.scrowviewdemo;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class GrideAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public GrideAdapter(Context context, List<String> data) {
        super(R.layout.item_img, data);
        this.mContext = context;
    }

    @Override
    protected void convert(final BaseViewHolder helper, String item) {
        ImageView ivImg = helper.getView(R.id.iv_imgsss);
        ivImg.setImageResource(R.mipmap.img2);

    }

}
