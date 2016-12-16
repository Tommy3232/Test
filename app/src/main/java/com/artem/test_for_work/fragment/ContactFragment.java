package com.artem.test_for_work.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.artem.test_for_work.R;

public class ContactFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_contacts;

   public static ContactFragment getInstance(Context context){
       Bundle args =new Bundle();
       ContactFragment fragment= new ContactFragment();
       fragment.setArguments(args);
       fragment.setContext(context);
       fragment.setTitle(context.getString(R.string.tab_item_contact));
       return fragment;
   }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
