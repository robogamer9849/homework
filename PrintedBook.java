public class PrintedBook extends Book{
    private int numberOfPages;

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("number of pages:" + numberOfPages);
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
