package com.artem.test_for_work.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.artem.test_for_work.R;

public class ExampleFragment1 extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example1;
    private View view;

    public static ExampleFragment1 getInstance(){
        Bundle args =new Bundle();
        ExampleFragment1 fragment= new ExampleFragment1();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
