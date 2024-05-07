import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileProcessor fileProcessor = FileProcessor.getInstance();
        fileProcessor.openFile("test.txt");
        fileProcessor.readLine();
        fileProcessor.readLine();

        fileProcessor.writeString("\nAt vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga.");
        fileProcessor.closeFile();

        System.out.println("\n");
        FileProcessor fileProcessor2 = FileProcessor.getInstance();
        fileProcessor2.openFile("test2.txt");
        fileProcessor2.readWholeFile();
        fileProcessor2.closeFile();
    }
}
