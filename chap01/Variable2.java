public class Variable2 {
    public static void main(String[] args) {
        int score = 100;
        System.out.println("score = " + score);
        score = 90;
        System.out.println("score = " + score);

        final int finalScore = 100;
        System.out.println("finalScore = " + finalScore);
//         finalScore = 90; // Error 발생
    }
}
