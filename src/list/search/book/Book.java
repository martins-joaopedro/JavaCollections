package list.search.book;

public class Book {
    
    private String author;
    private String title;
    private int yearReleased;
    
    Book(String author, String title, int yearReleased) {
        this.author = author;
        this.title = title;
        this.yearReleased = yearReleased;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "[author=" + author + ", title=" + title + ", yearReleased=" + yearReleased + "]";
    }

}
