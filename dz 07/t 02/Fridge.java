public class Fridge {
    private String reactionOne = "бутербродик";
    private String reactionTwo = "скалкой по башке";

    public void interaction (String name, Boolean triger) {
        if (triger) System.out.println(name + " стащил " + reactionOne);
        else System.out.println(name + " получил " + reactionTwo);
    }
}
