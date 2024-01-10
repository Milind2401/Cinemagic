package com.example.cinemagic2.ui.home;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.cinemagic2.Cat1;
import com.example.cinemagic2.Cat2;
import com.example.cinemagic2.Cat3;
import com.example.cinemagic2.Cat4;
import com.example.cinemagic2.Cat5;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Cat1();
            case 1:
                return new Cat2();
            case 2:
                return new Cat3();
            case 3:
                return new Cat4();
            case 4:
                return new Cat5();
        }
        return new Cat1();
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
