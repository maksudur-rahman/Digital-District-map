package com.ju.rotnocse.digitaldistrictmap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.bumptech.glide.Glide;
import com.ju.rotnocse.digitaldistrictmap.utils.ZoomLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    CircleImageView navheader;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        View navView=navigationView.inflateHeaderView(R.layout.na_header);
        navheader=navView.findViewById(R.id.navIV);
        String url = "https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/bd.png?alt=media&token=3fde0551-79df-4dfb-8092-0da740245f83";
        Glide.with(HomeActivity.this)
                .load(url)
                .into(navheader);
        navigationView.setNavigationItemSelectedListener(this);

        final ZoomLayout zoomlayout = findViewById(R.id.zoomLayout);
        zoomlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                zoomlayout.init(HomeActivity.this);
                return false;
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

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

    public void toPanch(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/panchagar1.jpg?alt=media&token=ba341b09-a7a7-4bba-a5a0-540d39c705b4";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/panchagar2.jpg?alt=media&token=98151786-10d8-41c4-84e0-ec7655458e7f";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/panchaagar3.jpg?alt=media&token=340082f0-295e-4809-8498-264f0278336d";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "পঞ্চগড়");
        intent.putExtra("details", getResources().getString(R.string.panchagar));
        startActivity(intent);
    }

    public void toPabna(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/pabna1.jpg?alt=media&token=ab2290c8-6e31-4b9a-9b7d-cf7582a98b0f";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/pabna2.jpg?alt=media&token=df1d0865-1425-4009-95c5-cbe275a0964f";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/pabna3.jpg?alt=media&token=aa46ed3a-3c65-40df-aa2f-2ff58278a011";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "পাবনা");
        intent.putExtra("details", getResources().getString(R.string.pabna));
        startActivity(intent);
    }

    public void toSatkhira(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/satkhira1.png?alt=media&token=2675100c-be02-48e5-b945-c3c6ac0c4b09";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/satkhira2.jpg?alt=media&token=d246865b-bd5a-4aca-a57b-3eff7727a02d";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/satkhira3.jpg?alt=media&token=0c5ae15f-77e2-4ed0-8f13-2af2cc7e7dd8";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "সাতক্ষীরা");
        intent.putExtra("details", getResources().getString(R.string.satkhira));
        startActivity(intent);
    }

    public void toJessore(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jessore1.jpg?alt=media&token=51d5a97d-3744-4a64-86a3-7ffde95db774";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jessore2.jpg?alt=media&token=f4025412-1d12-450b-8c09-ad19e1c27ab7";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jessore3.jpg?alt=media&token=9371ca00-c4ee-448d-9f81-84e9b3658b6f";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "যশোর");
        intent.putExtra("details", getResources().getString(R.string.jessore));
        startActivity(intent);
    }

    public void toJhinaidaha(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jhinaidaha1.jpg?alt=media&token=4c18bbe0-a6cf-45ff-9e33-692955eb3677";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jhinaidaha2.jpg?alt=media&token=fd887f03-3b46-44fb-8cca-104296b6393e";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jhinaidaha3.jpg?alt=media&token=4620091f-ec98-40bf-a0d0-3ad10f312768";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "ঝিনাইদহ");
        intent.putExtra("details", getResources().getString(R.string.jhinaidaha));
        startActivity(intent);
    }

    public void toMagura(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "মাগুরা");
        intent.putExtra("details", getResources().getString(R.string.magura));
        startActivity(intent);
    }

    public void toKhulna(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "খুলনা");
        intent.putExtra("details", getResources().getString(R.string.khulna));
        startActivity(intent);
    }

    public void toBagerhut(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "বাঘেরহাট");
        intent.putExtra("details", getResources().getString(R.string.bagherhat));
        startActivity(intent);
    }

    public void toCoxsbazar(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "কক্সবাজার");
        intent.putExtra("details", getResources().getString(R.string.coxsbazar));
        startActivity(intent);
    }

    public void toBandarban(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "বান্দরবন");
        intent.putExtra("details", getResources().getString(R.string.bandarban));
        startActivity(intent);
    }

    public void toChittagong(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/chittagong1.jpg?alt=media&token=152c97ba-d92e-4e51-ab99-42af1505f2b5";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/chittagong2.jpeg?alt=media&token=25c94ee0-333f-481f-9831-40ab4f209a4f";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/chittagong3.JPG?alt=media&token=61da3b47-f19e-4064-8da6-675e380c1f6a";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "চট্রগ্রাম");
        intent.putExtra("details", getResources().getString(R.string.chittagong));
        startActivity(intent);
    }

    public void toKahgrachari(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "খাগড়াছড়ি");
        intent.putExtra("details", getResources().getString(R.string.khagrachori));
        startActivity(intent);
    }

    public void toFeni(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo = "https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/fenilogo.PNG?alt=media&token=a5a00d50-522d-46cc-9b49-dc9d1de8c670";
        String url1 = "https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/feni1.jpg?alt=media&token=f04cc362-8ec1-4d7a-808e-232b8217f1d7";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/feni2.jpg?alt=media&token=120362df-f23f-48f2-ad8e-7c8c66e407c3";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/feni3.jpg?alt=media&token=c1ed9e3a-e877-46aa-b471-70c7308838e7";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "ফেনী");
        intent.putExtra("details", getResources().getString(R.string.feni));
        startActivity(intent);
    }

    public void toNoakhali(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/noakhali1.jpeg?alt=media&token=538c7e8f-865a-4809-b686-b26e5b9bd836";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/noakhali2.jpg?alt=media&token=58cc759f-ffd0-4a55-98c5-2b63ba5f5f68";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/noakhali3.jpg?alt=media&token=e4fbbaf0-5940-41e4-8669-19591016ae75";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "নোয়াখালী");
        intent.putExtra("details", getResources().getString(R.string.noakhali));
        startActivity(intent);

    }

    public void toVola(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/bhola.PNG?alt=media&token=77831646-f709-4f3b-8c46-277038d712ad";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/bhola1.jpg?alt=media&token=9a89242f-72f0-42ad-aff9-59821c04f5d0";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/bhola2.jpg?alt=media&token=7288e233-a8ed-43ec-83e2-e88de51d113c";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/bhola3.jpeg?alt=media&token=329ba28f-c359-4c89-96fb-d49b0612c530";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "ভোলা");
        intent.putExtra("details", getResources().getString(R.string.bhola));
        startActivity(intent);
    }

    public void toPatuakhali(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/potuakhali1.jpg?alt=media&token=64a6da97-e790-4b33-8b90-e942f5133716";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/potuakhali2.jpg?alt=media&token=238711fa-dca0-4a7c-9d11-31f31bb7fd37";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/potuakhali3.jpeg?alt=media&token=afcf2ffa-8894-43d4-8395-3e3ead9687cd";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "পটুয়াখালী");
        intent.putExtra("details", getResources().getString(R.string.potuakhali));
        startActivity(intent);
    }

    public void toThakurgaon(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "ঠাকুরগাঁও");
        intent.putExtra("details", getResources().getString(R.string.thakurgaon));
        startActivity(intent);
    }

    public void toNilphamari(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "নীলফামারী");
        intent.putExtra("details", getResources().getString(R.string.nilphamari));
        startActivity(intent);
    }

    public void toLalmonirhut(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "লালমনিরহাট");
        intent.putExtra("details", getResources().getString(R.string.lalmonirhut));
        startActivity(intent);
    }

    public void toKurigram(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "কুড়িগ্রাম");
        intent.putExtra("details", getResources().getString(R.string.kurigram));
        startActivity(intent);

    }

    public void toDinajpur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "দিনাজপুর");
        intent.putExtra("details", getResources().getString(R.string.dinajpur));
        startActivity(intent);

    }

    public void toRangpur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "রংপুর");
        intent.putExtra("details", getResources().getString(R.string.rangpur));
        startActivity(intent);
    }

    public void toGaibandha(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "গাইবান্ধা");
        intent.putExtra("details", getResources().getString(R.string.gaibandha));
        startActivity(intent);
    }

    public void toJaipurhut(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "জয়পুরহাট");
        intent.putExtra("details", getResources().getString(R.string.jaipurhut));
        startActivity(intent);
    }

    public void toNaogaon(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "নওগাঁ");
        intent.putExtra("details", getResources().getString(R.string.naogaon));
        startActivity(intent);
    }

    public void toChapai(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "চাপাই নবাবগঞ্জ");
        intent.putExtra("details", getResources().getString(R.string.chapai));
        startActivity(intent);
    }

    public void toRajshahi(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "রাজশাহী");
        intent.putExtra("details", getResources().getString(R.string.rajshahi));
        startActivity(intent);
    }

    public void toBagura(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "বগুড়া");
        intent.putExtra("details", getResources().getString(R.string.bogura));
        startActivity(intent);
    }

    public void toJamalpur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jamalpur1.jpg?alt=media&token=4270a6f5-a4b0-4026-9e29-78ad61026c1a";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jamalpur2.jpg?alt=media&token=9bf69c60-c2d2-4320-857d-12c26bc25c9c";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jamalpur3.jpg?alt=media&token=1b4ba811-853e-4f13-8f9b-ff144fc160ca";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "জামালপুর");
        intent.putExtra("details", getResources().getString(R.string.jamalpur));
        startActivity(intent);
    }

    public void toSherpur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/sherpur1.jpg?alt=media&token=5cc0e57f-53a8-4153-8801-f99b0f4d5c2f";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/sherpur2.jpg?alt=media&token=08ae650e-82e9-42ac-a85f-9fa802edd483";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/sherpur3.jpg?alt=media&token=659bfa50-3853-4c96-96ac-4de62edec623";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "শেরপুর");
        intent.putExtra("details", getResources().getString(R.string.sherpur));
        startActivity(intent);
    }

    public void toMymenshahi(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "ময়মনসিংহ");
        intent.putExtra("details", getResources().getString(R.string.mymensingh));
        startActivity(intent);
    }

    public void toNetrokona(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/netrokona1.jpg?alt=media&token=3b61ca9c-1eb1-4303-b4e6-5c7d5bdc2e82";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/netrokona2.jpg?alt=media&token=fa5a6aba-ec05-44c5-98c6-909b036f4565";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/Netrokona3.jpg?alt=media&token=a8968c0f-e2fb-4aa0-bb29-ce4e981d1b2d";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "নেত্রকোনা");
        intent.putExtra("details", getResources().getString(R.string.netrokona));
        startActivity(intent);
    }

    public void toSunamganj(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "সুনামগঞ্জ");
        intent.putExtra("details", getResources().getString(R.string.sunamgonj));
        startActivity(intent);
    }

    public void toSylhet(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "সিলেট");
        intent.putExtra("details", getResources().getString(R.string.sylhet));
        startActivity(intent);
    }

    public void toMoulovibazar(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "মৌলভীবাজার");
        intent.putExtra("details", getResources().getString(R.string.moulovibazar));
        startActivity(intent);
    }

    public void toHabiganj(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "হবিগঞ্জ");
        intent.putExtra("details", getResources().getString(R.string.hobigonj));
        startActivity(intent);
    }

    public void toKishorganj(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/kishoregnj1.jpg?alt=media&token=3e74cdaa-0636-4bb3-8693-cd3c38ab5895";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/kishorgonj2.jpg?alt=media&token=f1760c8b-9e39-4204-8002-322dbe561f67";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/kishoreganj3.jpg?alt=media&token=b4e84a98-8bb0-4f5b-a234-00df51eab9a8";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "কিশোরগঞ্জ");
        intent.putExtra("details", getResources().getString(R.string.kishorganj));
        startActivity(intent);
    }

    public void toTangail(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/tangail1.jpg?alt=media&token=724c4b71-e1f1-42b0-8558-4fda0ba773f9";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/tangail2.jpg?alt=media&token=ff4a71ac-d4ea-4d77-926e-a65342262ef0";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/tangail3.jpg?alt=media&token=64c39b89-7fc1-4d50-af07-8bfcfe874ae4";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "টাঙ্গাইল");
        intent.putExtra("details", getResources().getString(R.string.tangail));
        startActivity(intent);
    }

    public void toGazipur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/gazipur1.jpg?alt=media&token=163d73b9-b956-474c-b9f2-8c73618d800c";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/gazipur%202.jpg?alt=media&token=fbaff746-c2a8-4036-b97d-d6b591b04a9d";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/gazipur%203.jpg?alt=media&token=8c2cc4b5-81ca-4441-a8c8-0e3cbf0dd97b";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "গাজীপুর");
        intent.putExtra("details", getResources().getString(R.string.gazipur));
        startActivity(intent);
    }

    public void toNator(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "নাটোর");
        intent.putExtra("details", getResources().getString(R.string.natore));
        startActivity(intent);
    }

    public void toSirajganj(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "সিরাজগঞ্জ");
        intent.putExtra("details", getResources().getString(R.string.sirajgonj));
        startActivity(intent);
    }

    public void toKustia(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "কুষ্টিয়া");
        intent.putExtra("details", getResources().getString(R.string.kushtia));
        startActivity(intent);
    }

    public void toMeherpur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "মেহেরপুর");
        intent.putExtra("details", getResources().getString(R.string.meherpur));
        startActivity(intent);
    }

    public void toChuadanga(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "চুয়াডাঙ্গা");
        intent.putExtra("details", getResources().getString(R.string.chuadanga));
        startActivity(intent);
    }

    public void toRajbari(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/rajbari1.jpg?alt=media&token=c1ce9a8c-a6fd-4b85-9e40-8575725c9a7e";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/rajbari2.jpg?alt=media&token=d309df02-9601-49cb-bb2c-fe2238f1fe01";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/rajbari3.jpg?alt=media&token=1ea574ce-fbcc-4e5b-b9b3-0bb4ad4fdb47";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "রাজবাড়ি");
        intent.putExtra("details", getResources().getString(R.string.rajbari));
        startActivity(intent);
    }

    public void toManikganj(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/manikgnj1.jpg?alt=media&token=5142bb9c-2b6f-4154-a6cf-db91f066c49c";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/manikganj2.jpg?alt=media&token=ffe5cfcf-686a-4e05-b36e-a51f48573de6";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/manikganj3.jpg?alt=media&token=4eb46084-dd92-41e7-a80d-edd92ffd90e0";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "মানিকগঞ্জ");
        intent.putExtra("details", getResources().getString(R.string.manikgonj));
        startActivity(intent);
    }

    public void toDhaka(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/dhaka1.jpg?alt=media&token=cb0efda9-4809-43f4-a15e-960cf93aed84";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/d2.jpg?alt=media&token=39baa68f-fd36-4605-97b4-34a2c3c3ddea";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/d3.JPG?alt=media&token=6984455f-ae92-4a5c-a55c-235152bb668c";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "ঢাকা");
        intent.putExtra("details", getResources().getString(R.string.dhaka));
        startActivity(intent);
    }

    public void toNarayanganj(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/narayanganj1.jpg?alt=media&token=a3e737c7-b4ab-4755-a9a9-cd9bca5e877e";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/narayanganj2.jpg?alt=media&token=24e4bd6a-bba2-4d3f-9055-4ffa40b590e6";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/narayangnj3.jpg?alt=media&token=408c5b8c-61a5-4fd6-b356-aae269db8225";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "নারায়ণগঞ্জ");
        intent.putExtra("details", getResources().getString(R.string.narayongonj));
        startActivity(intent);
    }

    public void toNarsingdi(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/narsingdi1.jpg?alt=media&token=7cc03c4c-9ce3-4d5b-bcec-42ed720f8bb9";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/narsingdi2.jpg?alt=media&token=53b028e5-93ed-4bbb-a076-6a467c936e57";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/narsingdi3.jpg?alt=media&token=5165bd3e-b017-4782-8e8c-a5a4f1517f29";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "নরসিংদী");
        intent.putExtra("details", getResources().getString(R.string.narsingdi));
        startActivity(intent);
    }

    public void toBbaria(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "ব্রাহ্মণবাড়িয়া");
        intent.putExtra("details", getResources().getString(R.string.bbaria));
        startActivity(intent);
    }

    public void toComilla(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "কুমিল্লা");
        intent.putExtra("details", getResources().getString(R.string.comilla));
        startActivity(intent);
    }

    public void toMunshiganj(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/munshigonj1.jpeg?alt=media&token=dc2caf81-dd14-4481-b392-6c6abd6de7f4";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/munsignj2.jpg?alt=media&token=78045f15-15c8-4350-b74a-a716fc49d4d6";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/munshiganj_pic_3.jpg?alt=media&token=3dded60f-118e-4151-80df-49efb61a7579";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "মুনশিগঞ্জ");
        intent.putExtra("details", getResources().getString(R.string.munshigonj));
        startActivity(intent);
    }

    public void toFaridpur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/faridpur1.jpg?alt=media&token=0986f034-cf95-4cb4-bf93-8efc08793641";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/faridpur2.jpg?alt=media&token=b0aad4ee-d581-4298-b592-99197c9bc471";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/faridpr3.jpg?alt=media&token=a3d69aef-9ad5-4d1f-ac04-b5a726bc472d";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "ফরিদপুর");
        intent.putExtra("details", getResources().getString(R.string.faridpur));
        startActivity(intent);
    }

    public void toChadpur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "চাঁদপুর");
        intent.putExtra("details", getResources().getString(R.string.chadpur));
        startActivity(intent);
    }

    public void toShariotpur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/shariatpur.JPG?alt=media&token=b97ca9cd-2ad7-4dc2-8905-0a0f166a3bbf";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/sariatpur2.jpg?alt=media&token=33436477-9095-489c-8abb-3608744a6f74";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/sariatpur3.jpg?alt=media&token=af043f12-dac1-4dc2-9ee1-6a93fad6aba8";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "শরিয়তপুর");
        intent.putExtra("details", getResources().getString(R.string.shoriotpur));
        startActivity(intent);
    }

    public void toMadaripur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/madaripur1.jpg?alt=media&token=49a2afc4-8233-4b9a-956d-9dc3506a0f82";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/madaripur2.jpg?alt=media&token=e5257eaa-87b8-4883-8748-832d34be53ab";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/madaripur3.jpg?alt=media&token=dffc33b5-8bd3-421b-8759-b3c9b3e38835";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "মাদারীপুর");
        intent.putExtra("details", getResources().getString(R.string.madaripur));
        startActivity(intent);
    }

    public void toGopalganj(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/gopalgonj1.jpg?alt=media&token=45ee1ecb-5ae4-4f5a-90eb-fce1b3f157a9";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/gopalgonj2.jpg?alt=media&token=f16e1cf1-7cdb-48a0-8a75-7bf894cea4e0";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/goplgong3.jpg?alt=media&token=d4cc99ba-4dda-4a4c-9c36-82f890776560";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "গোপালগঞ্জ");
        intent.putExtra("details", getResources().getString(R.string.gopalgonj));
        startActivity(intent);
    }

    public void toNarail(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "নড়াইল");
        intent.putExtra("details", getResources().getString(R.string.narail));
        startActivity(intent);
    }

    public void toBarisal(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/barishal.PNG?alt=media&token=8584cba1-cfa4-4cbd-9ec0-fcedcd432404";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/barisal1.jpg?alt=media&token=85336c2c-9547-45f5-a7d2-61a70f9344d6";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/barisal2.jpg?alt=media&token=87a3c570-e348-4796-a84c-20977902142a";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/barisal3.JPG?alt=media&token=1ab03306-4bac-4b08-a40f-c4dfc5135798";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "বরিশাল");
        intent.putExtra("details", getResources().getString(R.string.barisal));
        startActivity(intent);
    }

    public void toPirojpur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/pirojpur1.jpg?alt=media&token=88b1e091-2ffc-482c-acff-a2ae0fcfb67b";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/pirojpur2.jpg?alt=media&token=59f5c8e7-e580-40a8-a7b7-9c266852edea";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/pirojpur3.jpg?alt=media&token=cb19380e-88bd-4daf-bb53-2f892f249b7c";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "পিরোজপুর");
        intent.putExtra("details", getResources().getString(R.string.pirojpur));
        intent.putExtra("book", "https://bangladesh.gov.bd/pdfjs/web/viewer.php?file=https://bangladesh.gov.bd/sites/default/files/files/bangladesh.gov.bd/district_branding_book/2491b6f1_4b5d_4486_9681_e9288919193e/Pirojpur.pdf");
        startActivity(intent);
    }

    public void toJhalkathi(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jhalokathi1.jpg?alt=media&token=279765fe-cc45-49e3-8444-8990bce17e41";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jhalokathi2.jpg?alt=media&token=4adfe530-e18e-4003-a707-a87b993a9218";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/jhalokathi3.jpg?alt=media&token=8ad86fa4-c02c-4f9a-bbfd-e585b794ae7f";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "ঝালকাঠি");
        intent.putExtra("details", getResources().getString(R.string.jhalokathi));
        startActivity(intent);
    }

    public void toRangamati(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="";
        String url2 ="";
        String url3 ="";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "রাঙ্গামাটি");
        intent.putExtra("details", getResources().getString(R.string.rangamati));
        startActivity(intent);
    }

    public void toLuxipur(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/laxmipur1.jpeg?alt=media&token=6aefca74-b1dc-41b2-91ee-0dee039eb687";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/laxmipur2.jpg?alt=media&token=2f3d9af8-261a-4d5b-8e06-540d96df6525";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/laxmipur3.JPG?alt=media&token=ee057db0-d9b1-4085-ba66-50cf117f1323";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "লক্ষ্মীপুর");
        intent.putExtra("details", getResources().getString(R.string.laxmipur));
        startActivity(intent);
    }

    public void toBarguna(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        String urllogo ="";
        String url1 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/barguna1.jpg?alt=media&token=cf29d752-0630-4706-b6ae-e15c043931c9";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/barguna2.jpg?alt=media&token=97324b19-8872-4a4e-96db-ac795a71a888";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/barguna3.jpg?alt=media&token=2462dd03-8e10-48e0-8684-33df45d64b06";
        intent.putExtra("logo", urllogo);
        intent.putExtra("img1", url1);
        intent.putExtra("img2", url2);
        intent.putExtra("img3", url3);
        intent.putExtra("name", "বরগুনা");
        intent.putExtra("details", getResources().getString(R.string.borguna));
        startActivity(intent);
    }
}