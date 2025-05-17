import java.util.Random;

public class MagicBall {
    private static final String[] RESPONSE = {

            "Бесспорно",
            "Определённо да",
            "Вероятнее всего",
            "Хорошие перспективы",
            "Спроси позже",
            "Попробуй снова",
            "Мой ответ — нет",
            "Весьма сомнительно"
    };

    public static String getPrediction() {
        Random rand = new Random();
        int namber = (int) rand.nextInt(RESPONSE.length);
        return RESPONSE[namber];
    }
}
