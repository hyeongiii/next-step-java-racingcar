package step3;

public class ResultView {
    private static final String MOVE_SYMBOL = "-";

    public static void showResult(int distance) {
        System.out.println(MOVE_SYMBOL.repeat(distance));
    }
}
