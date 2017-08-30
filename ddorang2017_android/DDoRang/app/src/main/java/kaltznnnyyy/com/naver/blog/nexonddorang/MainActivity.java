package kaltznnnyyy.com.naver.blog.nexonddorang;

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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.content_main);
        final View v = new View(getApplicationContext());

        Point pt = new Point();
        getWindowManager().getDefaultDisplay().getSize(pt);
        v.setLayoutParams(new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));
        v.setBackgroundColor(Color.RED);
        layout.addView(v);
        v.setVisibility(View.INVISIBLE);

        final Animation animSizeUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sizeup);
        TextView tv = (TextView)findViewById(R.id.tv_test);
        tv.setText(pt.toString());
        tv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View _v, MotionEvent event) {
                if(!animSizeUp.hasStarted() || animSizeUp.hasEnded()) {
                    v.animate().y(_v.getY());
                    v.setVisibility(View.VISIBLE);
                    v.startAnimation(animSizeUp);
                }
                return false;
            }
        });

        Animation animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        tv.startAnimation(animBlink);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
