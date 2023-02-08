import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		try {
				String line;
			BufferedReader reader = new BufferedReader(new FileReader("ReadFile.txt"));
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}