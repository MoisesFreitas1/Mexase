package losfreitasapps.com.mexase.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import losfreitasapps.com.mexase.R;
import losfreitasapps.com.mexase.ShowActivities.ShowQuestion;


public class HomeActivity extends Activity implements Runnable {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        YoYo.with(Techniques.FadeIn).duration(1500).playOn(findViewById(R.id.textoinicial));

        ImageView gifHome = (ImageView) findViewById(R.id.gifHome);
        Glide.with(this).load(R.drawable.runner1).asGif().into(gifHome);

        Handler handler = new Handler();
        handler.postDelayed(this, 6000);
    }

    public void run(){
        startActivity(new Intent(this, ShowQuestion.class));
        finish();
    }
}