package com.artem.test_for_work.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.artem.test_for_work.R;
import com.artem.test_for_work.adapter.MuzikaListAdapter;
import com.artem.test_for_work.dto.TestDTO;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_news;


    public static NewsFragment getInstance(Context context) {
        Bundle args = new Bundle();
        NewsFragment fragment = new NewsFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_news));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new MuzikaListAdapter(createMockMuzikaListData()));


        return view;
    }

    private List<TestDTO> createMockMuzikaListData() {
        List<TestDTO> data = new ArrayList<>();
        data.add(new TestDTO("Новость 1"));
        data.add(new TestDTO("Новость 2"));
        data.add(new TestDTO("Новость 3"));
        data.add(new TestDTO("Новость 4"));
        data.add(new TestDTO("Новость 5"));
        return data;


    }

    public void setContext(Context context) {
        this.context = context;
    }
}
