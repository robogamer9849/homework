public class App {
    public static void main(String[] args) {

        Book book = new Book();
        PrintedBook printedBook = new PrintedBook();
        EBook eBook = new EBook();

        book.setTitle("dummy the mummy");
        book.setAuthor("Hoopa");
        book.setPublicationYear(1399);
        System.out.println("BOOK:");
        book.displayDetails();

        System.out.println();
        printedBook.setTitle("dummy the mummy");
        printedBook.setAuthor("Hoopa");
        printedBook.setPublicationYear(1399);
        printedBook.setNumberOfPages(150);
        System.out.println("PRINTED:");
        printedBook.displayDetails();

        System.out.println();
        eBook.setTitle("dummy the mummy");
        eBook.setAuthor("Hoopa");
        eBook.setPublicationYear(1399);
        eBook.setFileSize(54);
        eBook.setFileFormat("pdf");
        System.out.println("EBOOK:");
        eBook.displayDetails();
    }
}
