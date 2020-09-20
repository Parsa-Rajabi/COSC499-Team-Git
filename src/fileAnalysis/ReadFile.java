package fileAnalysis;

import java.io.*;

public class ReadFile {

    public static String readFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String data = "";
        try {
            String line = br.readLine();

            while (line != null) {
                data += line;
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return data;
    }
}
