import java.io.*;
class write {
    public static void main(String[] shit) throws IOException {
        FileReader file = new FileReader("File/stuff/languages.txt");
        BufferedReader br = new BufferedReader(file);

        String language = br.readLine();

        System.out.println("Some cool programming languages :");

        while(language != null) {
            System.out.print(language+" ");
            language = br.readLine();
        }
    }
}