public class Laptop {
    private final String brand;
    private final String cpu;
    private final int ram;
    private final int ssd;
    private final int hdd;
    private final double weight;
    private final String color;

    public Laptop(String brand, String cpu, int ram, int ssd, int hdd, double weight, String color) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
        this.weight = weight;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public int getHdd() {
        return hdd;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}