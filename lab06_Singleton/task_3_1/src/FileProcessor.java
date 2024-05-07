import java.io.*;

public class FileProcessor {
    private FileProcessor() {}

    private static FileProcessor instance = null;
    private static BufferedReader bufferedReader = null;
    private static BufferedWriter bufferedWriter = null;
    public static FileProcessor getInstance() {
        if (instance == null) {
            instance = new FileProcessor();
        }
        return instance;
    }

    public void openFile(String filename) throws IOException {
        bufferedReader = new BufferedReader(new FileReader(filename));
        bufferedWriter = new BufferedWriter(new FileWriter(filename, true));
    }

    public void closeFile() throws IOException {
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        else {
            System.out.println("No open file found");
        }
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        else {
            System.out.println("No open file found");
        }
    }

    public void readLine() throws IOException {
        System.out.println(bufferedReader.readLine());
    }

    public void writeString(String str) throws IOException {
        bufferedWriter.write(str);
    }

    public void readWholeFile() throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
