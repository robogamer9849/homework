public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public void displayDetails() {
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("publication year:" + publicationYear);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
