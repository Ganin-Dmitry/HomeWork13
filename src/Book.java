public class Book {
    private int yearPublication;
    private Author author;
    private String titleBook;

    public Book (Author author, String titleBook, int yearPublication) {
        this.author = author;
        this.titleBook = titleBook;
        this.yearPublication = yearPublication;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getTitleBook() {
        return this.titleBook;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
