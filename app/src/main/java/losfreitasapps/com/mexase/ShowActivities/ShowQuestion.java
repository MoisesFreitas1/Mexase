package losfreitasapps.com.mexase.ShowActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

import losfreitasapps.com.mexase.ListViews.LQuestions;
import losfreitasapps.com.mexase.Models.Question;
import losfreitasapps.com.mexase.R;

public class ShowQuestion extends AppCompatActivity {
    private TextView enunciadoTextView;
    private Button sim;
    private Button nao;
    int[] nquestion;
    int nquestions;
    int m;
    private int numNo;
    private Question question;
    private LinearLayout ll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_question);
        ll = (LinearLayout) findViewById(R.id.ll);
        enunciadoTextView = (TextView) findViewById(R.id.enunciadoTextView);
        sim = (Button) findViewById(R.id.sim);
        nao = (Button) findViewById(R.id.nao);

        YoYo.with(Techniques.FadeIn).duration(1500).playOn(findViewById(R.id.ll));
        m = 0;
        nquestions = 10;
        numNo = 0;

        nquestion = new int[10];
        int tquestions[];
        int aux;

        Random random = new Random();
        tquestions = new int[nquestions];
        for (int b = 0; b < nquestions; b++) {
            tquestions[b] = b + 1;
        }
        for (int n = 0; n < 10; n++) {
            do {
                aux = random.nextInt(nquestions);
                nquestion[n] = tquestions[aux];
            } while (tquestions[aux] == 0);
            tquestions[aux] = 0;
        }

        question = LQuestions.getLquestion().get(nquestion[m] - 1);
        enunciadoTextView.setText(question.getEnunciado());

        sim.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        if (m == (nquestion.length - 1)) {
                            YoYo.with(Techniques.FadeOut).duration(1000).playOn(findViewById(R.id.ll));
                            Intent i = new Intent(ShowQuestion.this, ResultActivity.class);
                            i.putExtra("result", numNo);
                            startActivity(i);
                            finish();
                        }
                        if (m < (nquestion.length - 1)) {
                            YoYo.with(Techniques.ZoomOutLeft).duration(1000).playOn(findViewById(R.id.ll));
                            m = m + 1;
                            question = LQuestions.getLquestion().get(nquestion[m] - 1);
                            enunciadoTextView.setText(question.getEnunciado());
                            YoYo.with(Techniques.ZoomInRight).duration(1000).playOn(findViewById(R.id.ll));
                        }
                    }
                });
        nao.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        numNo = numNo + 1;
                        if (m == (nquestion.length - 1)) {
                            YoYo.with(Techniques.FadeOut).duration(1000).playOn(findViewById(R.id.ll));
                            Intent i = new Intent(ShowQuestion.this, ResultActivity.class);
                            i.putExtra("result", numNo);
                            startActivity(i);
                            finish();                        }
                        if (m < (nquestion.length - 1)) {
                            YoYo.with(Techniques.ZoomOutLeft).duration(1000).playOn(findViewById(R.id.ll));
                            m = m + 1;
                            question = LQuestions.getLquestion().get(nquestion[m] - 1);
                            enunciadoTextView.setText(question.getEnunciado());
                            YoYo.with(Techniques.ZoomInRight).duration(1000).playOn(findViewById(R.id.ll));
                        }
                    }
                });
    }
}
