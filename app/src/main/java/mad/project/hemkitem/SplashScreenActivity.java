package mad.project.hemkitem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fullscreen
        View decorView=getWindow().getDecorView();

        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        //next page transition
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this,LoginActivity.class));
            }
        },3000);




    }
}