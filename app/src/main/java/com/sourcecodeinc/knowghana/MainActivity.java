package com.sourcecodeinc.knowghana;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_nav_drawer);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new HomeFragment())
                .commit();

        mDrawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        int id = menuItem.getItemId();
                        if (id == R.id.nav_home) {
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.content_frame, new HomeFragment())
                                    .commit();
                            getSupportActionBar().setTitle(R.string.home_know_ghana);
                        }
                        if(id == R.id.nav_places){
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.content_frame, new RegionFragment())
                                    .commit();
                            getSupportActionBar().setTitle(R.string.places);
                        }

                        if (id == R.id.nav_hotel) {
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.content_frame, new HotelFragment())
                                    .commit();
                            getSupportActionBar().setTitle(R.string.hotels);
                        }

                        if (id == R.id.nav_attractions) {
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.content_frame, new AttractionsFragment())
                                    .commit();
                            getSupportActionBar().setTitle(R.string.attractions);
                        }

                        if (id == R.id.nav_restaurant) {
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.content_frame, new RestaurantFragment())
                                    .commit();
                            getSupportActionBar().setTitle(R.string.restaurant);
                        }
                        return true;
                    }
                });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;


        }
        return super.onOptionsItemSelected(item);
    }
}
