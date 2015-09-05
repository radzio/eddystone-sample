package com.malmstein.eddystonesample.scan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.malmstein.eddystonesample.R;
import com.novoda.notils.caster.Views;

public class BeaconsList extends FrameLayout {

    private RecyclerView beaconsList;

    public BeaconsList(Context context) {
        super(context);
    }

    public BeaconsList(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BeaconsList(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        LayoutInflater.from(getContext()).inflate(R.layout.view_beacons, this, true);


        beaconsList = Views.findById(this, R.id.beacons_list);

    }

}
