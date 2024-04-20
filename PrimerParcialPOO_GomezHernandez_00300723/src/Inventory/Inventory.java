package Inventory;

import java.util.ArrayList;
import Articles.*;

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

    // Methods
    public void addArticle(Article article) {
        articlesList.add(article);
    }

    public Article searchArticle(String articleName) {
        for (Article article : articlesList) {
            if (articleName.equals(article.getName()))
                return article;
        }

        return null;
    }

    public void showArticleInformation(Article article) {
        System.out.println(" - Name: " + article.getName());
        System.out.println(" - Model: " + article.getModel());
        System.out.println(" - Description: " + article.getDescription());
        System.out.println(" - Price: $" + article.getPrice());

        if (article instanceof Phone) {
            System.out.println(" - Camera quality: " + ((Phone) article).getCameraQuality());
            System.out.println(" - Screen resolution: " + ((Phone) article).getScreenResolution());
        } else if (article instanceof Laptop) {
            System.out.println(" - Operative system: " + ((Laptop) article).getOs());
            System.out.println(" - RAM capacity: " + ((Laptop) article).getRam());
        }
    }

    public void showAllArticles() {
        int counter = 1;

        for(Article article : articlesList) {
            System.out.println("N°: " + counter);
            showArticleInformation(article);
            counter++;
        }
    }

    public void updateArticle(Article article, String newDescription, float newPrice) {
        if (article == null) return;

        article.setDescription(newDescription);
        article.setPrice(newPrice);
    }
}
