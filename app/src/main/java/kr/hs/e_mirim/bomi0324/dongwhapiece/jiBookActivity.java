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

public class jiBookActivity extends AppCompatActivity {

    Button left, right;
    LinearLayout background;
    int[] imgs = {R.drawable.jistart, R.drawable.ji1, R.drawable.ji2, R.drawable.ji3,
            R.drawable.ji4, R.drawable.ji5,  R.drawable.ji6, R.drawable.ji7, R.drawable.ji8, R.drawable.ji9
            , R.drawable.ji10, R.drawable.ji11, R.drawable.ji12, R.drawable.ji13};
    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ji);
        left=(Button)findViewById(R.id.left);
        right=(Button)findViewById(R.id.right);
        background=(LinearLayout)findViewById(R.id.backgroundji);
        background.setBackgroundResource(R.drawable.jistart);

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
                Intent intent = new Intent(jiBookActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
