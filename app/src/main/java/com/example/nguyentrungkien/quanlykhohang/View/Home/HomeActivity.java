package com.example.nguyentrungkien.quanlykhohang.View.Home;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment.FragmentDistributor;
import com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment.FragmentEmployee;
import com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment.FragmentOrigin;
import com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment.FragmentQuality;
import com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment.FragmentSupplies;
import com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment.FragmentSuppliesGroup;
import com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment.FragmentUnit;
import com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment.FragmentWarehouse;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private FragmentManager fragmentManager;
    private FragmentWarehouse fragmentWarehouse;
    private SharedPreferences sharedPreferences;
    private View headerView;
    private TextView txtEmployee_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();

        sharedPreferences = HomeActivity.this.getSharedPreferences("Employee", Context.MODE_PRIVATE);

        headerView = navigationView.getHeaderView(0);

        txtEmployee_name = headerView.findViewById(R.id.txtEmployee_name);

        txtEmployee_name.setText(sharedPreferences.getString("employeeName",""));
        if(savedInstanceState == null)
        {
            fragmentWarehouse = new FragmentWarehouse();
            fragmentManager.beginTransaction().add(R.id.content_layout,fragmentWarehouse).commit();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.itemWarehouse:
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                FragmentWarehouse fragmentWarehouse = new FragmentWarehouse();
                transaction.replace(R.id.content_layout,fragmentWarehouse);
                transaction.commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.itemEmployee:
                FragmentTransaction transaction1 = fragmentManager.beginTransaction();
                FragmentEmployee fragmentEmployee = new FragmentEmployee();
                transaction1.replace(R.id.content_layout,fragmentEmployee);
                transaction1.commit();
                drawerLayout.closeDrawer(GravityCompat.START);

                break;

            case R.id.itemDistributor:
                FragmentTransaction transaction2 = fragmentManager.beginTransaction();
                FragmentDistributor fragmentDistributor = new FragmentDistributor();
                transaction2.replace(R.id.content_layout,fragmentDistributor);
                transaction2.commit();
                drawerLayout.closeDrawer(GravityCompat.START);

                break;

            case R.id.itemOrigin:
                FragmentTransaction transaction3 = fragmentManager.beginTransaction();
                FragmentOrigin fragmentOrigin = new FragmentOrigin();
                transaction3.replace(R.id.content_layout,fragmentOrigin);
                transaction3.commit();
                drawerLayout.closeDrawer(GravityCompat.START);

                break;

            case R.id.itemUnit:
                FragmentTransaction transaction4 = fragmentManager.beginTransaction();
                FragmentUnit fragmentUnit = new FragmentUnit();
                transaction4.replace(R.id.content_layout,fragmentUnit);
                transaction4.commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.itemSuppliesGroup:
                FragmentTransaction transaction5 = fragmentManager.beginTransaction();
                FragmentSuppliesGroup fragmentSuppliesGroup = new FragmentSuppliesGroup();
                transaction5.replace(R.id.content_layout,fragmentSuppliesGroup);
                transaction5.commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.itemQuality:
                FragmentTransaction transaction6 = fragmentManager.beginTransaction();
                FragmentQuality fragmentQuality = new FragmentQuality();
                transaction6.replace(R.id.content_layout,fragmentQuality);
                transaction6.commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.itemSupplies:
                FragmentTransaction transaction7 = fragmentManager.beginTransaction();
                FragmentSupplies fragmentSupplies = new FragmentSupplies();
                transaction7.replace(R.id.content_layout,fragmentSupplies);
                transaction7.commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
        }
        return true;
    }
}
