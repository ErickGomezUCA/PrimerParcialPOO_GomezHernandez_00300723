package Articles;

public class Phone extends Article {
    private float cameraQuality;
    private float screenResolution;

    // Constructors
    public Phone() {
        cameraQuality = 0.0f;
        screenResolution = 0.0f;
    }

    public Phone(String name, String model, String description, float price, float cameraQuality, float screenResolution) {
        super(name, model, description, price);
        this.cameraQuality = cameraQuality;
        this.screenResolution = screenResolution;
    }

    public Phone(Article article, float cameraQuality, float screenResolution) {
        super(article.getName(), article.getModel(), article.getDescription(), article.getPrice());
        this.cameraQuality = cameraQuality;
        this.screenResolution = screenResolution;
    }

    // Getters and setters

    public float getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(float cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    public float getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(float screenResolution) {
        this.screenResolution = screenResolution;
    }
}
