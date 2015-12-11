package manuvarel.AlanMaracazoEncuestas;

import java.util.LinkedList;
import java.util.List;

public interface ILanguageStrategy {
	String key = "question";
	List<String> questions = new LinkedList<String>();
	
	public void readQuestions();
	public List<String> getQuestions();
}
