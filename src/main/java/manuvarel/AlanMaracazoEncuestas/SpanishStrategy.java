package manuvarel.AlanMaracazoEncuestas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class SpanishStrategy implements ILanguageStrategy {

	public void readQuestions() {
		try {
			Properties property = new Properties();
			property.load(new FileInputStream("src/main/resources/spanishQuestions.properties"));

			questions.add(property.getProperty(key + "1"));
			questions.add(property.getProperty(key + "2"));

			System.out.println(questions.toString());

		} catch (FileNotFoundException e) {
			System.out.println("Error, File not found");
		} catch (IOException e) {
			System.out.println("Error, cant read the file");
		}
	}

	public List<String> getQuestions() {
		return questions;
	}

}
