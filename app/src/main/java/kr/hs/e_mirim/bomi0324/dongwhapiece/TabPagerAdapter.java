package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                ChuActivity tabFragment1 = new ChuActivity();
                return tabFragment1;
            case 1:
                NewActivity tabFragment2 = new NewActivity();
                return tabFragment2;
            case 2:
                SearchActivity tabFragment3 = new SearchActivity();
                return tabFragment3;
            case 3:
               MypageActivity tabFragment4 = new MypageActivity();
                return tabFragment4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
