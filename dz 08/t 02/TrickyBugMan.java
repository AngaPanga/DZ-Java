public class TrickyBugMan extends Person {
    private String talk;
    public TrickyBugMan(int weight, int age, String mame, String sex) {
        super(weight, age, mame, sex);
    }

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
