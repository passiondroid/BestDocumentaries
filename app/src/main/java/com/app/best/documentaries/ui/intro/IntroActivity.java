package com.app.best.documentaries.ui.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.best.documentaries.R;
import com.app.best.documentaries.ui.preferences.PreferenceActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.startBtn)
    public void onClick(View view){
        Intent intent = new Intent(this,PreferenceActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left,R.anim.slide_right);
    }
}
