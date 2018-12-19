package com.demo.ycwang.ycwangdemo.tab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.demo.ycwang.ycwangdemo.R;

import java.util.ArrayList;
import java.util.List;

public class TabActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager);

        initViewPager();

    }

    private void initViewPager() {
        tabLayout = findViewById(R.id.tab);
        List<String> titles = new ArrayList<>();
        titles.add("体育");
        titles.add("动漫");
        titles.add("购物");
        titles.add("明星");
        titles.add("视频");
        titles.add("图文");
        titles.add("本地");
        titles.add("精选");
        titles.add("搞笑");
        titles.add("语录");


        List<Fragment> fragments = new ArrayList<>();
        for (String title : titles) {
            tabLayout.addTab(tabLayout.newTab().setText(title));
            fragments.add(new ListFragment());
        }

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
