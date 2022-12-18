public class TrickyBugMan extends Person {
    private Boolean access;

    public TrickyBugMan(String mame, String date, String sex) {
        super(mame, date, sex);
    }


    public Boolean getAccess() {
        return access;
    }

    public void setAccess(Boolean access) {
        this.access = access;
    }
}
