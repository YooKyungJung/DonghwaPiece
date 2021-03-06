package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Student on 2017-11-09.
 */

public class julBookActivity extends AppCompatActivity {

    Button left, right;
    LinearLayout background;
    int[] imgs = {R.drawable.julstart, R.drawable.jul1, R.drawable.jul2, R.drawable.jul3,
            R.drawable.jul4, R.drawable.jul5,  R.drawable.jul6,  R.drawable.jul8};
    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jul);
        left=(Button)findViewById(R.id.left);
        right=(Button)findViewById(R.id.right);
        background=(LinearLayout)findViewById(R.id.backgroundjul);
        background.setBackgroundResource(R.drawable.julstart);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt!=0) cnt--;
                background.setBackgroundResource(imgs[cnt]);
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt!=imgs.length)cnt++;
                background.setBackgroundResource(imgs[cnt]);
            }
        });

        Button btn_prev =(Button)findViewById(R.id.back);
        btn_prev.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(julBookActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
