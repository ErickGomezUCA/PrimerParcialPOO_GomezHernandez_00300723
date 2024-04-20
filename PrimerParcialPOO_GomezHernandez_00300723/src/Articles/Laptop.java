package Articles;

public class Laptop extends Article {
    private String os;
    private int ram;

    // Constructors
    public Laptop() {
    }

    public Laptop(String name, String model, String description, float price, String os, int ram) {
        super(name, model, description, price);
        this.os = os;
        this.ram = ram;
    }

    public Laptop(Article article, String os, int ram) {
        super(article.getName(), article.getModel(), article.getDescription(), article.getPrice());
        this.os = os;
        this.ram = ram;
    }

    // Getters and setters


    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
