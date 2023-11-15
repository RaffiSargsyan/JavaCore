package map.example;

public class Language {
    public String en;
    public String hy;

    public Language(String en, String hy) {
        this.en = en;
        this.hy = hy;
    }

    @Override
    public String toString() {
        return "Language{" +
                "en='" + en + '\'' +
                ", hy='" + hy + '\'' +
                '}';
    }
}
