// Importing the input & output package of java
import java.io.*;
class write {
    public static void main(String[] shit) throws IOException {
        // Creating a file write object
        FileWriter FWriter = new FileWriter("File/stuff/text.txt"); // string contains the path to write files on
        BufferedWriter BWriter = new BufferedWriter(FWriter);
        PrintWriter PWriter = new PrintWriter(BWriter);

        // Printing stuff in the file via Print Writer
        PWriter.println("Hello world welcome to my file\n");
        PWriter.print("Haha");
        PWriter.print(" you");
        PWriter.print(" can do this");
        PWriter.print(" too!");
        PWriter.println();
        PWriter.println("Thanks a lot for reading!");

        PWriter.close();
        BWriter.close();
        FWriter.close();
    }
}