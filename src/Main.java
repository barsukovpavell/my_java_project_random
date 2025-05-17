public class Main {
    public static void main(String[] args) {
        System.out.println(generateNamber());
    }

    public static int generateNamber() {
        return (int) (Math.random() * 100);
    }
}