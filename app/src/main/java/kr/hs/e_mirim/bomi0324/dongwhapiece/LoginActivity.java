package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by 두리 on 2017-11-10.
 */

public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //requesWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
    }

    private void requesWindowFeature(int featureNoTitle) {
    }

}