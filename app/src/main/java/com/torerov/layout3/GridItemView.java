package com.torerov.layout3;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Choi on 2015-10-24.
 */
public class GridItemView extends RelativeLayout {

    GridItemData mData;

        public GridItemView(Context context) {
        super(context);
        init();
    }

    ImageView mImageView;
    TextView mTextView;

    private void init() {
        inflate(getContext(), R.layout.view_grid_item, this);
        mImageView = (ImageView)findViewById(R.id.image_background);
        mTextView = (TextView)findViewById(R.id.text_title);
    }

    public void setItemData(GridItemData data){

        mImageView.setImageResource(data.mBackgroundImageResource);
        mTextView.setText(data.mTitle);
    }
}
