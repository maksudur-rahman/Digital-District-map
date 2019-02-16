package com.ju.rotnocse.digitaldistrictmap.utils;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.ju.rotnocse.digitaldistrictmap.R;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    //private Integer [] images = {R.drawable.bhola,R.drawable.barishal,R.drawable.fenilogo};
    ArrayList<String>images;

    //String [] url={"https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/feni%2Ffeni1.jpg?alt=media&token=508f4384-6157-404b-ac7b-28e6d04baaf3","https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/feni%2Ffeni2.jpg?alt=media&token=5ef2c3bb-0596-46a9-8041-cea96fabec17","https://firebasestorage.googleapis.com/v0/b/digital-district-map.appspot.com/o/feni%2Ffeni3.jpg?alt=media&token=f3f1e669-e5ad-4ce9-92d9-940b64724e96"};
    public ViewPagerAdapter(Context context, ArrayList<String>images) {
        this.context = context;
        this.images=images;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = view.findViewById(R.id.imageView);

            Glide.with(context)
                    .load(images.get(position))
                    .into(imageView);
        /*imageView.setImageResource(images[position]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position == 0){
                   // Intent intent = new Intent(context, Diplay_Image_Activity.class);
                    //intent.putExtra("IMAGE", (new Gson()).toJson(position));
                    Toast.makeText(context, "Slide 1 Clicked", Toast.LENGTH_SHORT).show();
                } else if(position == 1){
                    Toast.makeText(context, "Slide 2 Clicked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "Slide 3 Clicked", Toast.LENGTH_SHORT).show();
                }

            }
        });

*/
        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}