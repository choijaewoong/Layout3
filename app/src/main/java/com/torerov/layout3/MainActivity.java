package com.torerov.layout3;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView mGridView;
    GridAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(R.layout.actionbar_layout);

        mGridView = (GridView)findViewById(R.id.gridView);
        mAdapter = new GridAdapter();
        mGridView.setAdapter(mAdapter);
        initData();
    }

    private void initData() {
        String[] title = getResources().getStringArray(R.array.title);
        TypedArray backgrounImage = getResources().obtainTypedArray(R.array.background_image);

        for(int i=0; i<title.length; i++){
            int resourceId = backgrounImage.getResourceId(i, -1);

            mAdapter.add(new GridItemData(title[i], resourceId));
        }
    }
}
