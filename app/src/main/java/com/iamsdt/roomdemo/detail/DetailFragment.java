package com.iamsdt.roomdemo.detail;

import android.arch.lifecycle.LifecycleFragment;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.iamsdt.roomdemo.R;

import javax.inject.Inject;

/**
 * Created by Shudipto Trafder on 11/15/2017.
 */

public class DetailFragment extends LifecycleFragment {

    private static final String EXTRA_ITEM_ID = "EXTRA_ITEM_ID";

    private TextView dateAndTime;
    private TextView message;
    private ImageView coloredBackground;

    private String itemId;

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    //ListItemViewModel listItemViewModel;

    public DetailFragment() {
    }


    public static DetailFragment newInstance(String itemId) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(EXTRA_ITEM_ID, itemId);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);

        dateAndTime = (TextView) v.findViewById(R.id.lbl_date_and_time_header);

        message = (TextView) v.findViewById(R.id.lbl_message_body);


        coloredBackground = (ImageView) v.findViewById(R.id.imv_colored_background);

        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
