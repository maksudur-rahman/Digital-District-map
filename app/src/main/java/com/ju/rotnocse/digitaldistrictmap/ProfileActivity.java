package com.ju.rotnocse.digitaldistrictmap;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
import com.ju.rotnocse.digitaldistrictmap.utils.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.Timer;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String API_KEY = "AIzaSyAJjrrjI6qpICHVav8c_QBZ5z4JSvFfSio";
    public static final String VIDEO_ID = "XAziB2XMDJY";

    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    TextView nameTV,detailsTV;
    String nameDt,detailsDT;
    String image1,image2,image3;
    CircleImageView logoIMG,navHeader;
    CircleImageView districtlogoIMG;
    private ImageView[] dots;
    ArrayList<String>images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameTV=findViewById(R.id.nameTV);
        detailsTV=findViewById(R.id.detailsTV);

        nameDt=getIntent().getStringExtra("name");
        detailsDT=getIntent().getStringExtra("details");
        image1=getIntent().getStringExtra("img1");
        image2=getIntent().getStringExtra("img2");
        image3=getIntent().getStringExtra("img3");
        nameTV.setText(nameDt);
        detailsTV.setText(detailsDT);
        logoIMG=findViewById(R.id.logo);
        districtlogoIMG=findViewById(R.id.profileimage);

        images=new ArrayList<>();
        images.add(image1);
        images.add(image2);
        images.add(image3);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        View navView=navigationView.inflateHeaderView(R.layout.na_header);
        navHeader=navView.findViewById(R.id.navIV);
        String url = "https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/bd.png?alt=media&token=3fde0551-79df-4dfb-8092-0da740245f83";
        Glide.with(ProfileActivity.this)
                .load(url)
                .into(navHeader);

        Glide.with(ProfileActivity.this)
                .load(url)
                .into(logoIMG);

        String dlogo=getIntent().getStringExtra("logo");
        Glide.with(ProfileActivity.this)
                .load(dlogo)
                .into(districtlogoIMG);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();

       /* if (id == R.id.nav_camera) {
            Intent intent=new Intent(EventProfileActivity.this, Dhaka.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {

        }
*/
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });

        /** Initializing YouTube Player View **/
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY, this);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this,images);

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        //timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
        Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        /** add listeners to YouTubePlayer instance **/
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);

        /** Start buffering **/
        if (!wasRestored) {
            player.cueVideo(VIDEO_ID);
        }
    }

    private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
        @Override
        public void onBuffering(boolean arg0) {
        }
        @Override
        public void onPaused() {
        }
        @Override
        public void onPlaying() {
        }
        @Override
        public void onSeekTo(int arg0) {
        }
        @Override
        public void onStopped() {
        }
    };

    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
        @Override
        public void onAdStarted() {
        }
        @Override
        public void onError(ErrorReason arg0) {
        }
        @Override
        public void onLoaded(String arg0) {
        }
        @Override
        public void onLoading() {
        }
        @Override
        public void onVideoEnded() {
        }
        @Override
        public void onVideoStarted() {
        }
    };

    public void toBrandingBook(View view) {
        String url;
        url=getIntent().getStringExtra("book");
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(myIntent);
    }
}
