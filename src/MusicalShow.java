public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // печатаем текст либретто
    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + title + "\":");
        System.out.println(librettoText);
    }
}
