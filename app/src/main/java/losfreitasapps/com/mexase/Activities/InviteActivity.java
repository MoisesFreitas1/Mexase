package losfreitasapps.com.mexase.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import losfreitasapps.com.mexase.R;

public class InviteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite);

        YoYo.with(Techniques.FadeIn).duration(1500).playOn(findViewById(R.id.textoconvite));
        YoYo.with(Techniques.FadeIn).duration(1500).playOn(findViewById(R.id.start));

        ImageView start = (ImageView) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run();
            }
        });
    }

    public void run(){
        startActivity(new Intent(this, HomeActivity.class));
    }
}
