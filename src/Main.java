public class Main {
    public static void main(String[] args) {
        //System.out.println(generateNamber());
        System.out.println(rollDice());

        System.out.println("Получится ли заработать на новую машину?");
        System.out.println(MagicBall.getPrediction());
    }

    public static int generateNamber() {
        return (int) (Math.random() * 100);
    }

    public static int rollDice() {
        int value;
        value = (int) ((Math.random() * 6) + 1);
        return value;
    }
}