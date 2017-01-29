package ngocollab.com.specificngoeventinfo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Abhi on 21-01-2017.
 */
//Extending FragmentStatePagerAdapter
public class PagerNgoEventInfo extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;
    private String[] tabTitles = new String[]{"About Us", "Events", "Albums", "Members"};
    //Constructor to the class
    public PagerNgoEventInfo(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }


    // overriding getPageTitle()

    /* you can add name to tab instead only icon i.e. text with icon */
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }



    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                Tab1Aboutus tab1 = new Tab1Aboutus();
                return tab1;
            case 1:
                Tab2Events tab2 = new Tab2Events();
                return tab2;
            case 2:
                Tab3Albums tab3 = new Tab3Albums();
                return tab3;
            case 3:
                Tab4Members tabProfileFragment = new Tab4Members();
                return tabProfileFragment;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
