package manuvarel.AlanMaracazoEncuestas;

public class Survey {

	ILanguageStrategy languageStrategy;
	
	String question1;
	String question2;
	String question3;
	
	public ILanguageStrategy getLanguageStrategy() {
		return languageStrategy;
	}
	public void setLanguageStrategy(ILanguageStrategy languageStrategy) {
		this.languageStrategy = languageStrategy;
	}
	public String getQuestion1() {
		return question1;
	}
	public void setQuestion1(String question1) {
		this.question1 = question1;
	}
	public String getQuestion2() {
		return question2;
	}
	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	public String getQuestion3() {
		return question3;
	}
	public void setQuestion3(String question3) {
		this.question3 = question3;
	}
	
	
}
