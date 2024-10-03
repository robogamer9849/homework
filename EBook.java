public class EBook extends Book{
    private int fileSize;
    private String fileFormat;

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("file size: " + fileSize + " (MB)");
        System.out.println("file format: " + fileFormat);
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
}
