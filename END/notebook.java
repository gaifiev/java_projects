package END;

public class notebook {
    int id;
    int memory;
    int ssd;
    String os;
    String color;
    String brand;

    public notebook(int id, int memory, int ssd, String os, String color, String brand) {
        this.id = id;
        this.memory = memory;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
        this.brand = brand;
    }

    public String toString() {
        return String.format("id: %d, ram: %d, ssd: %d, OS: %s, color: %s, brand: %s", id, memory, ssd, os, color,
                brand);
    }

    public boolean equals(Object o) {
        notebook t = (notebook) o;
        return id == t.id;
    }
}
