package Articles;

import Interfaces.*;

public abstract class Article implements ArticleInformation {
    // Attributes
    private String name;
    private String model;
    private String description;
    private float price;

    // Constructors
    public Article() {
        name = "";
        model = "";
        description = "";
        price = 0.0f;
    }

    public Article(String name, String model, String description, float price) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.price = price;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    // Interface Implementations
    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
