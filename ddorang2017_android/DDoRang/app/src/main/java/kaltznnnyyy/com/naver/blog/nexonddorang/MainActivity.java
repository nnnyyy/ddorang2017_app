package kaltznnnyyy.com.naver.blog.nexonddorang;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.content_main);
        View v = new View(getApplicationContext());

        Point pt = new Point();
        getWindowManager().getDefaultDisplay().getSize(pt);
        v.setLayoutParams(new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));
        v.setBackgroundColor(Color.RED);
        v.setX(10);
        v.setY(100);
        layout.addView(v);

        TextView tv = (TextView)findViewById(R.id.tv_test);
        tv.setText(pt.toString());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
