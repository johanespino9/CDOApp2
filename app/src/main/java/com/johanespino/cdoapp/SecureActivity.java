package com.johanespino.cdoapp;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.johanespino.cdoapp.views.secure.fragments.networking.LeerQrFragment;

public class SecureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);
    }

    protected void onPostViews(Bundle savedInstanceState){
        /* Load Fragment */
        if (findViewById(R.id.main_fragment) != null) {
            if (savedInstanceState != null) {
                return;
            }
            LeerQrFragment firstFragment = new LeerQrFragment();
            firstFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_fade, R.anim.exit_fade)
                    .add(R.id.main_fragment, firstFragment).commit();
        }
    }

}
