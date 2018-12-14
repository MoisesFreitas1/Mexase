package losfreitasapps.com.mexase.Models;

/**
 * Created by Moises on 06/02/17.
 */

public class Question {

    private Long id;
    private String enunciado;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
}
