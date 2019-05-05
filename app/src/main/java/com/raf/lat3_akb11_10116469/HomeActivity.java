package com.raf.lat3_akb11_10116469;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView nMainNav;
    private FrameLayout nMainFrame;

    private HomeFragment homeFragment;
    private DailyFragment dailyFragment;
    private GalleryFragment galleryFragment;
    private MediaFragment mediaFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nMainFrame = (FrameLayout)findViewById(R.id.main_frame);
        nMainNav = (BottomNavigationView)findViewById(R.id.main_nav);

        homeFragment = new HomeFragment();
        dailyFragment = new DailyFragment();
        galleryFragment = new GalleryFragment();
        mediaFragment = new MediaFragment();
        profileFragment = new ProfileFragment();

        nMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.home_nav :
                        nMainNav.setItemBackgroundResource(R.color.blues);
                        setFragment(homeFragment);
                        return true;

                    case R.id.daily_nav :
                        nMainNav.setItemBackgroundResource(R.color.blues);
                        setFragment(dailyFragment);
                        return true;

                    case R.id.gallery_nav :
                        nMainNav.setItemBackgroundResource(R.color.blues);
                        setFragment(galleryFragment);
                        return true;

                    case R.id.music_nav :
                        nMainNav.setItemBackgroundResource(R.color.blues);
                        setFragment(mediaFragment);
                        return true;

                    case R.id.profile_nav :
                        nMainNav.setItemBackgroundResource(R.color.blues);
                        setFragment(profileFragment);
                        return true;

                    default:
                        return false;

                }

            }

            private void setFragment(Fragment fragment) {

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_frame, fragment);
                fragmentTransaction.commit();
            }
        });
    }

}
