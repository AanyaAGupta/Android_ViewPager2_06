package com.example.p7l06guptaaanya;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainFragment extends Fragment {
    ViewPager2 viewPager2;
    int position;
    public static Fragment newInstance(ViewPager2 mViewPager, int position) {
        MainFragment fragment = new MainFragment();
        fragment.viewPager2 = mViewPager;
        fragment.position = position;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TabLayout tabLayout = getActivity().findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> tab.setText("I am  " + (position + 1))
        ).attach();
        Button mButton = view.findViewById(R.id.button_pressme);
        mButton.setText("Press " + position);


//        mButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getContext(),"toasty"+viewPager2.getCurrentItem()
//                        , Toast.LENGTH_LONG).show();
//            }
//        });
//        System.out.println("Testing: I created a new fragment"+viewPager2.getCurrentItem());
    }
}
