import java.util.Objects;

public class Cat {
    private String reactionOne = "Коте бежит на зов!";
    private String reactionTwo = "Коте посмотрел непонимающими глазами!!!";

    public void interaction (String callMan) {
        if (Objects.equals(callMan, "кис кис")) System.out.println(reactionOne);
        else System.out.println(reactionTwo);
    }
}
