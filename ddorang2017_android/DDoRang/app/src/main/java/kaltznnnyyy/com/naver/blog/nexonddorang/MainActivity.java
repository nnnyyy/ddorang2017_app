package kaltznnnyyy.com.naver.blog.nexonddorang;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import kaltznnnyyy.com.naver.blog.nexonddorang.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(mBinding.toolbar);
        Animation animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        mBinding.contentMain.tvTest.startAnimation(animBlink);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
