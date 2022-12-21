import java.util.Objects;

public class Cat extends Animal implements Run {
    private String nick;

    public Cat(String nick, int weight, int age) {
        super(weight, age);
        this.nick = nick;
    }

    public void listen (String sound) {
        if (Objects.equals(sound, nick)) running();
        else System.out.println(nick + " проигнорировал вас.");
    }

    @Override
    public void running() {
        System.out.println("Коте бежит на зов!");
    }
}
