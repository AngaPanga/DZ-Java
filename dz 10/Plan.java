import java.io.*;
import java.util.*;

public class Plan implements Libs {
    private ArrayList<ConstructionPlan> plans = new ArrayList<>();

    public void importFile(){
        StringBuilder str = new StringBuilder();
        try(FileReader reader = new FileReader("notes.csv"))
        {
            int c;
            while((c = reader.read()) !=-1){
                str.append((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        String st = new String(str);
        for (String line: st.split("\n")) {
            ArrayList<String> lineTable = new ArrayList<>(Arrays.asList(line.split(",")));
            plans.add(new ConstructionPlan(Integer.parseInt(lineTable.get(0)),
                    Integer.parseInt(lineTable.get(1)),
                    (GregorianCalendar) strToDate(lineTable.get(2)),
                    (GregorianCalendar) strToDate(lineTable.get(3)),
                    lineTable.get(4),
                    lineTable.get(5)));
        }
    }
    public void newTask(){
        plans.add(new ConstructionPlan(inputInt("Id задачи: "),
                inputInt("Приоритет выполнения (1-3): "),
                inputStr("Автор задачи: "),
                inputStr("Задача: ")));
    }

    public void sortingTasks(){
        Collections.sort(plans);
    }

    @Override
    public String toString() {
        for (ConstructionPlan p: plans) {
            System.out.println(p);
        }
        return "";
    }

    public void exportFile(){
        try(FileWriter writer = new FileWriter("notes.csv", false)) {
            //writer.write("");
            for (ConstructionPlan cpl: plans){
                String text = convertText(cpl.getId(), cpl.getLevel(), cpl.getDate(cpl.getTimeNow()),
                        cpl.getDate(cpl.getDeadLine()), cpl.getAuthor(), cpl.getTask());
                writer.append(text);
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
