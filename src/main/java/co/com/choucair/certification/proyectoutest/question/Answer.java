package co.com.choucair.certification.proyectoutest.question;

import co.com.choucair.certification.proyectoutest.userinterface.EnterTheSecurityInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String mensajeWelcome = Text.of(EnterTheSecurityInformationPage.NAME_MESSAGE_WELCOME).viewedBy(actor).asString();

        if (question.equals(mensajeWelcome)) {
            result = true;
            System.out.println("misión cumplida");
        } else {
            result = false;
            System.out.println("misión no cumplida");
        }
        return result;
    }
}
