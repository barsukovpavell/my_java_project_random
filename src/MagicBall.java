import java.util.Random;

public class MagicBall {
    private static final String A = "Бесспорно";
    private static final String B = "Определённо да";
    private static final String C = "Вероятнее всего";
    private static final String D = "Хорошие перспективы";
    private static final String F = "Спроси позже";
    private static final String G = "Попробуй снова";
    private static final String H = "Мой ответ — нет";
    private static final String L = "Весьма сомнительно";

    public static String getPrediction(){
        int rand = new Random().nextInt(8);
        if(rand == 0){
            return A;
        } else if (rand == 1) {
            return B;
        } else if (rand == 2) {
            return C;
        } else if (rand == 3) {
            return D;
        } else if (rand == 4) {
            return F;
        } else if (rand == 5) {
            return G;
        }else if(rand == 6){
            return H;
        } else if (rand == 7) {
            return L;
        }else {
            return null;
        }
    }
}
