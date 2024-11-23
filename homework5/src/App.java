public class App {
    public static void main(String[] args) throws Exception {
        RecordManagement filemanager = new RecordManagement();
        filemanager.writeData("file", "dadghdgshgfhdta");
        filemanager.appendData("file2", "sfdafuwsifg\n\n\n");
        // filemanager.deleteFile("file");
        filemanager.deleteFile("txt");
        filemanager.deleteFile("file2");
        filemanager.readFile("file2");
    }
}
