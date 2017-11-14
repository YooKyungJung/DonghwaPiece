package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ChuActivity extends Fragment implements View.OnClickListener {
    TextView value1, value2, value3, value4, value5, value6, value7, value8, value9, value10;
    RatingBar rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10;

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.activity_chu, container, false);

        rb1 = (RatingBar)rootView.findViewById(R.id.ratingBar1);
        rb2 = (RatingBar) rootView.findViewById(R.id.ratingBar2);
        rb3 = (RatingBar) rootView.findViewById(R.id.ratingBar3);
        rb4 = (RatingBar) rootView.findViewById(R.id.ratingBar4);
        rb5 = (RatingBar) rootView.findViewById(R.id.ratingBar5);
        rb6 = (RatingBar) rootView.findViewById(R.id.ratingBar6);
        rb7 = (RatingBar) rootView.findViewById(R.id.ratingBar7);
        rb8 = (RatingBar) rootView.findViewById(R.id.ratingBar8);
        rb9 = (RatingBar) rootView.findViewById(R.id.ratingBar9);
        rb10 = (RatingBar) rootView.findViewById(R.id.ratingBar10);

        value1 = (TextView) rootView.findViewById(R.id.value1);
        value2 = (TextView) rootView.findViewById(R.id.value2);
        value3 = (TextView) rootView.findViewById(R.id.value3);
        value4 = (TextView) rootView.findViewById(R.id.value4);
        value5 = (TextView) rootView.findViewById(R.id.value5);
        value6 = (TextView) rootView.findViewById(R.id.value6);
        value7 = (TextView) rootView.findViewById(R.id.value7);
        value8 = (TextView) rootView.findViewById(R.id.value8);
        value9 = (TextView) rootView.findViewById(R.id.value9);
        value10 = (TextView) rootView.findViewById(R.id.value10);

        rb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value1.setText("별점 : " + rating);
            }
        });
        rb2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value2.setText("별점 : " + rating);
            }
        });
        rb3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value3.setText("별점 : " + rating);
            }
        });
        rb4.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value4.setText("별점 : " + rating);
            }
        });
        rb5.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value5.setText("별점 : " + rating);
            }
        });
        rb6.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value6.setText("별점 : " + rating);
            }
        });
        rb7.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value7.setText("별점 : " + rating);
            }
        });
        rb8.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value8.setText("별점 : " + rating);
            }
        });
        rb9.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value9.setText("별점 : " + rating);
            }
        });
        rb10.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value10.setText("별점 : " + rating);
            }
        });

        btn_1 = (Button) rootView.findViewById(R.id.btn1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        btn_2 = (Button) rootView.findViewById(R.id.btn2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        btn_3 = (Button) rootView.findViewById(R.id.btn3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        btn_4 = (Button) rootView.findViewById(R.id.btn4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        btn_5 = (Button) rootView.findViewById(R.id.btn5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        btn_6 = (Button) rootView.findViewById(R.id.btn6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        btn_7 = (Button) rootView.findViewById(R.id.btn7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        btn_8 = (Button) rootView.findViewById(R.id.btn8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        btn_9 = (Button) rootView.findViewById(R.id.btn9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        btn_10 = (Button) rootView.findViewById(R.id.btn10);
        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }

    @Override
    public void onClick(View v) {

    }
}
