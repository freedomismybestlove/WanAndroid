package com.senon.module_life;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.senon.lib_common.ConstantLoginArouter;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_activity_splash);

        findViewById(R.id.life_main_login_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String curUrl = ConstantLoginArouter.PATH_LIFE_MAINACTIVITY;
                ARouter.getInstance().build(ConstantLoginArouter.PATH_COMMON_LOGINACTIVITY)
                        .withString("targetUrl",curUrl)
                        .navigation();
            }
        });
    }
}
