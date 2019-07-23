package com.aimer.viewpager.utils;

import android.graphics.Bitmap;
import android.util.LruCache;

public class LruCacheUtils {
    int maxMemory = (int) (Runtime.getRuntime().maxMemory()/1024);
    int cacheSize = maxMemory/8;

    public void initLru(){
        LruCache<String, Bitmap> lruCache = new LruCache<String, Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getRowBytes()*bitmap.getHeight()/1024;
            }
        };
    }

}
