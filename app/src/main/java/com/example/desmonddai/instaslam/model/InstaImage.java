package com.example.desmonddai.instaslam.model;

import android.net.Uri;

/**
 * Created by desmonddai on 7/8/16.
 */
public class InstaImage {
    private Uri imgResourceUrl;

    public Uri getImgResourceUrl() {
        return imgResourceUrl;
    }

    public InstaImage(Uri imgResourceUrl) {
        this.imgResourceUrl = imgResourceUrl;
    }
}
