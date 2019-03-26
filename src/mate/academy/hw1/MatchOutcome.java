package mate.academy.hw1;

// задание 1.1
public class MatchOutcome {
    public static int matchResult(int ScoreA, int ScoreB, int MatchBetA, int MatchBetB) {
        return ((ScoreA == MatchBetA) && (ScoreB == MatchBetB)) ? 2 : (((ScoreA > ScoreB) &&
                (MatchBetA > MatchBetB))) || (((ScoreA < ScoreB) && (MatchBetA < MatchBetB))) ? 1 : 0;
    }

    public static void main(String[] args) {
        // проверка работы метода:
        System.out.println(matchResult(0, 2, 0, 2)); // 2
        System.out.println(matchResult(0, 2, 1, 2)); // 1
        System.out.println(matchResult(0, 2, 1, 1)); // 0
    }
}
