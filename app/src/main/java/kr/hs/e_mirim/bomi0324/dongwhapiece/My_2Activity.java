package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import kr.hs.e_mirim.bomi0324.dongwhapiece.MainActivity;

public class My_2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_2);

        Button btn_prev=(Button) findViewById(R.id.bt_pink2);
        btn_prev.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                //이전 페이지로 화면전환
                Intent intent = new Intent(My_2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
