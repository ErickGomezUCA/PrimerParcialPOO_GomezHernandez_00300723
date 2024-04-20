package Inventory;

import java.util.ArrayList;
import Articles.Article;

public class Inventory {
    private ArrayList<Article> articlesList;

    // Constructors

    public Inventory() {
        articlesList = new ArrayList<Article>();
    }

    public Inventory(ArrayList<Article> articlesList) {
        this.articlesList = articlesList;
    }

    // Getters and Setters

    public ArrayList<Article> getArticlesList() {
        return articlesList;
    }

    public void setArticlesList(ArrayList<Article> articlesList) {
        this.articlesList = articlesList;
    }

    
}
