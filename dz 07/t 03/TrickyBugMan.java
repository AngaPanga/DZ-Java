public class TrickyBugMan extends Person {
    private String call;
    public TrickyBugMan(String mame, String date, String sex) {
        super(mame, date, sex);
    }


    public String getCall() {
        return call;
    }

    public void setAccess(String call) {
        this.call = call;
    }
}
