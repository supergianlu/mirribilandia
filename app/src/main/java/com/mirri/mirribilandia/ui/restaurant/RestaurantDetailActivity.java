package com.mirri.mirribilandia.ui.restaurant;

import android.os.Bundle;

import com.mirri.mirribilandia.R;
import com.mirri.mirribilandia.ui.base.BaseActivity;

/**
 * Simple wrapper for {@link RestaurantDetailFragment}
 * This wrapper is only used in single pan mode (= on smartphones)
 */
public class RestaurantDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Show the Up button in the action bar.
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        RestaurantDetailFragment fragment =  RestaurantDetailFragment.newInstance(getIntent().getStringExtra(RestaurantDetailFragment.ARG_ITEM_ID));
        getFragmentManager().beginTransaction().replace(R.id.article_detail_container, fragment).commit();
    }

    @Override
    public boolean providesActivityToolbar() {
        return false;
    }
}
