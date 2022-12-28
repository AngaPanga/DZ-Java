import java.util.Calendar;
import java.util.GregorianCalendar;

public class ConstructionPlan implements TimeInfo, Comparable<ConstructionPlan>{
    private int id;
    private int level;
    private Calendar timeNow;
    private Calendar deadLine;
    private String author;
    private String task;

    public ConstructionPlan(int id, int level, String author, String task) {
        this.id = id;
        this.level = level;
        this.timeNow = new GregorianCalendar();
        this.deadLine = tinp();
        this.author = author;
        this.task = task;
    }
    public ConstructionPlan(int id, int level, GregorianCalendar start, GregorianCalendar end,
                            String author, String task) {
        this.id = id;
        this.level = level;
        this.timeNow = start;
        this.deadLine = end;
        this.author = author;
        this.task = task;
    }

    @Override
    public String toString() {
        return id + ".   Приоритет: " + level +
                "\n  Дата начала: " + getDate(timeNow) +
                "\n  Дата окончания: " + getDate(deadLine) +
                "\n  Постановщик задачи: " + author +
                "\n     Задание: " + task + "\n";
    }

    public int getId() {return id;}
    public int getLevel() {return level;}

    public Calendar getTimeNow() {return timeNow;}
    public Calendar getDeadLine() {return deadLine;}
    public void setLevel(int level) {this.level = level;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getTask() {return task;}
    public void setTask(String task) {this.task = task;}

    @Override
    public int compareTo(ConstructionPlan getPlan) {
        if (this.level - getPlan.getLevel()==0){
            return  deadLine.compareTo(getPlan.deadLine);
        }else return this.level - getPlan.getLevel();
    }
}
