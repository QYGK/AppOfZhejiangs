package com.example.appofzhejiang.Setting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.appofzhejiang.R;

public class SettingActivity extends AppCompatActivity {

    private Button mBtnRollOut;
    private RelativeLayout user;
    private Toolbar back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        mBtnRollOut = findViewById(R.id.roll_out);
        user = findViewById(R.id.user);
        back = findViewById(R.id.setting_toolbar);

        back.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mBtnRollOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this,PersonalInformationActivity.class);
                startActivity(intent);
            }
        });
    }
}