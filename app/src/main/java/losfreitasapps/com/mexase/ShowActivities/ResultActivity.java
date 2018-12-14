package losfreitasapps.com.mexase.ShowActivities;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import losfreitasapps.com.mexase.R;

public class ResultActivity extends Activity implements Runnable {
    private int result;
    private TextView resultado, numbNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageView gifResult = (ImageView) findViewById(R.id.gifResult);

        result = getIntent().getIntExtra("result", 0);
        numbNo = (TextView) findViewById(R.id.numbNo);
        numbNo.setText("Sim: "+(10-result)+"\nNão: "+result);
        resultado = (TextView) findViewById(R.id.resultado);
        if (result >= 8 && result <= 10) {
            gifResult.setImageResource(R.drawable.runner4);
            Glide.with(this).load(R.drawable.runner4).asGif().into(gifResult);
            resultado.setText("Boa condição física");
        } else if (result >= 6 && result <= 7) {
            gifResult.setImageResource(R.drawable.runner2);
            Glide.with(this).load(R.drawable.runner2).asGif().into(gifResult);
            resultado.setText("Condição física normal");
        } else if (result >= 0 && result <= 5) {
            gifResult.setImageResource(R.drawable.cansado);
            Glide.with(this).load(R.drawable.cansado).asGif().into(gifResult);
            resultado.setText("Condição física insuficiente. Você não está em boas condições físicas. Precisa praticar mais atividades físicas.");
        }
        YoYo.with(Techniques.FadeIn).duration(1500).playOn(findViewById(R.id.resultado));

        Handler handler = new Handler();
        handler.postDelayed(ResultActivity.this, 15000);
    }

    public void run(){
        finish();
    }
}