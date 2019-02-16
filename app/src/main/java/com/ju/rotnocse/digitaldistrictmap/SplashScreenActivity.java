package com.ju.rotnocse.digitaldistrictmap;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class SplashScreenActivity extends AppCompatActivity {
    private static final String TAG = SplashScreenActivity.class.getSimpleName();

    private final int SPLASH_DISPLAY_LENGTH = 3000;
    ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);


        if(!isConnected(SplashScreenActivity.this)) buildDialog(SplashScreenActivity.this).show();
        else {
            setContentView(R.layout.activity_splash);

            splashImage = findViewById(R.id.splashIV);
            String url = "https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/bd.png?alt=media&token=3fde0551-79df-4dfb-8092-0da740245f83";
            Glide.with(SplashScreenActivity.this)
                    .load(url)
                    .into(splashImage);

            ActionBar actionBar = getSupportActionBar();
            if (null != actionBar) {
                actionBar.hide();
            }

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent startActivityIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);
                    startActivity(startActivityIntent);
                    SplashScreenActivity.this.finish();
                }
            }, SPLASH_DISPLAY_LENGTH);
        }

    }

    public boolean isConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if ((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting()))
                return true;
            else
                return false;
        } else
            return false;
    }

    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or wifi to access this. Press ok to Exit");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        return builder;
    }

}
