package com.aimer.viewpager.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.aimer.viewpager.R;

public class AnimActivity extends AppCompatActivity {

    private View mAnimView;

    public static void openAnimActivity(Context context){
        Intent intent = new Intent();
        intent.setClass(context,AnimActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);
        mAnimView = findViewById(R.id.anim_view);
        ObjectAnimator.ofFloat(mAnimView,"translationY",0,100).setDuration(1000).start();

        mAnimView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnimActivity.this,"Anim------",Toast.LENGTH_LONG).show();
            }
        });
    }
}
