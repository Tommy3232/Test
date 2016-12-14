package com.artem.test_for_work;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;


public class MainActivity extends Activity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();

    }
    private void initToolbar(){
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){
            @Override
            public boolean onMenuItemClick(MenuItem menuItem){
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);
    }
}
