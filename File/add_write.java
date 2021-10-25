import java.io.*;
class add_write {
    public static void main(String[] shit) throws IOException {
        FileWriter FWriter = new FileWriter("File/stuff/text.txt", true);
        BufferedWriter BWriter = new BufferedWriter(FWriter);
        PrintWriter PWriter = new PrintWriter(BWriter);

        // Printing stuff in the file via Print Writer
        PWriter.println("Old stuff remains safe, If there is some\n");

        PWriter.close();
        BWriter.close();
        FWriter.close();
    }
}