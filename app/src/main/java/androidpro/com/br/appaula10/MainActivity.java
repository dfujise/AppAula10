package androidpro.com.br.appaula10;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

    Tab mTab1;
    Tab mTab2;
    Tab mTab3;
    Tab mTab4;
    Tab mTab5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        mTab1 = actionBar.newTab().setText("List").setTabListener(new NavTabListener());
        mTab2 = actionBar.newTab().setText("Custom").setTabListener(new NavTabListener());
        mTab3 = actionBar.newTab().setText("Grid").setTabListener(new NavTabListener());
        mTab4 = actionBar.newTab().setText("Gallery").setTabListener(new NavTabListener());
        mTab5 = actionBar.newTab().setText("Flipper").setTabListener(new NavTabListener());

        actionBar.addTab(mTab1);
        actionBar.addTab(mTab2);
        actionBar.addTab(mTab3);
        actionBar.addTab(mTab4);
        actionBar.addTab(mTab5);

        showList();
    }

    public void showList() {
        SimpleListFragment fragmentA = new SimpleListFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_container, fragmentA);
        ft.addToBackStack("fragment a");
        ft.setTransition(FragmentTransaction.TRANSIT_NONE);
        ft.commit();
    }

    public void showCustomList() {
        CustomListFragment fragmentE = new CustomListFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_container, fragmentE);
        ft.addToBackStack("custom");
        ft.setTransition(FragmentTransaction.TRANSIT_NONE);
        ft.commit();
    }

    public void showGrid() {
        SimpleGridFragment fragmentB = new SimpleGridFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_container, fragmentB);
        ft.addToBackStack("grid");
        ft.setTransition(FragmentTransaction.TRANSIT_NONE);
        ft.commit();
    }

    public void showGallery() {
        SimpleGalleryFragment fragmentC = new SimpleGalleryFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_container, fragmentC);
        ft.addToBackStack("gallery");
        ft.setTransition(FragmentTransaction.TRANSIT_NONE);
        ft.commit();
    }

    public void showFlipper() {
        SimpleFlipperFragment fragmentD = new SimpleFlipperFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_container, fragmentD);
        ft.addToBackStack("flipper");
        ft.setTransition(FragmentTransaction.TRANSIT_NONE);
        ft.commit();
    }


    private class NavTabListener implements ActionBar.TabListener {
        public NavTabListener() {
        }

        @Override
        public void onTabReselected(Tab tab, FragmentTransaction ft) {
        }

        @Override
        public void onTabSelected(Tab tab, FragmentTransaction ft) {
            if (tab.equals(mTab1)) {
                showList();
            } else if (tab.equals(mTab2)) {
                showCustomList();
            } else if (tab.equals(mTab3)) {
                showGrid();
            } else if (tab.equals(mTab4)) {
                showGallery();
            } else if (tab.equals(mTab4)) {
                showFlipper();
            }
        }

        @Override
        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        }
    }
}
