package com.UciStudentCenterAndEventServices.ArtGallery;

import android.app.Application;
import android.util.Log;

import com.estimote.sdk.EstimoteSDK;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoTools;


//
// Running into any issues? Drop us an email to: contact@estimote.com
//

public class ZotGalleryApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        EstimoteSDK.initialize(getApplicationContext(), "art-gallery-g6b", "b032804b5b17da0f9b0f0a45d9e8d01b");

    }

    @Override
    public void onTerminate(){
        Picasso p = Picasso.with(getApplicationContext());
        PicassoTools.clearCache(p);

    }
}
