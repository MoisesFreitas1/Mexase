package losfreitasapps.com.mexase.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import losfreitasapps.com.mexase.R;

public class OpenActivity extends Activity implements Runnable {

    private LinearLayout ll1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        YoYo.with(Techniques.FadeIn).duration(1500).playOn(findViewById(R.id.mexase));
        YoYo.with(Techniques.FadeIn).duration(1500).playOn(findViewById(R.id.nomeapp));

        Handler handler = new Handler();
        handler.postDelayed(this, 4000);
    }

    public void run() {
        YoYo.with(Techniques.SlideOutRight).duration(500).playOn(findViewById(R.id.mexase));
        YoYo.with(Techniques.SlideOutLeft).duration(500).playOn(findViewById(R.id.nomeapp));

        startActivity(new Intent(this, InviteActivity.class));
        finish();
    }
}