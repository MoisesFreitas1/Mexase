package losfreitasapps.com.mexase.ListViews;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.mexase.Models.Question;

/**
 * Created by Moises on 14/09/17.
 */

public class LQuestions {

    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setEnunciado("Após um período de sono normal, você acorda indisposto?");
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setEnunciado("Você não gosta de fazer ginástica após se levantar?");
            lquestion.add(question);

            question = new Question();
            question.setId(3L);
            question.setEnunciado("Ao fazer uma pequena caminhada, sente-se cansado?");
            lquestion.add(question);

            question = new Question();
            question.setId(4L);
            question.setEnunciado("Quando faz exercícios físicos, sente dores no corpo no dia seguinte?");
            lquestion.add(question);

            question = new Question();
            question.setId(5L);
            question.setEnunciado("Após subir uma escada com muitos degraus, sente muita fadiga?");
            lquestion.add(question);

            question = new Question();
            question.setId(6L);
            question.setEnunciado("Após grande atividade física, sente dores no abdome?");
            lquestion.add(question);

            question = new Question();
            question.setId(7L);
            question.setEnunciado("Durante o dia você se sente cansado e sem vontade de fazer nada?");
            lquestion.add(question);

            question = new Question();
            question.setId(8L);
            question.setEnunciado("Após uma corrida prolongada, sente tonturas e náusea?");
            lquestion.add(question);

            question = new Question();
            question.setId(9L);
            question.setEnunciado("Nas suas horas de folga prefere dormir em vez de praticar uma atividade física?");
            lquestion.add(question);

            question = new Question();
            question.setId(10L);
            question.setEnunciado("Você não gosta de se movimentar constantemente?");
            lquestion.add(question);
        }
        return lquestion;
    }
}