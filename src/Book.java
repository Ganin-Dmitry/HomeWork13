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

    @Override
    public String toString () {
        return "Автор: " + this.author.toString() + ", Название: " + this.titleBook + ", " + this.yearPublication + " года выпуска.";
    }

    @Override
    public int hashCode () {
        return java.util.Objects.hash(titleBook);
    }

    public boolean equals (Book book2) {
        if (this.getClass() != book2.getClass()) {
            return false;
        }
        return this.getAuthor().equals(book2.getAuthor()) && this.getTitleBook().equals(book2.getTitleBook());
    }
}
