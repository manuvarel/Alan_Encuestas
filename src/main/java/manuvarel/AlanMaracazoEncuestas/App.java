package manuvarel.AlanMaracazoEncuestas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tutorial6.Letter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("manuvarel.AlanMaracazoEncuestas/context.xml");
		ILanguageStrategy strategy = (ILanguageStrategy) cntx.getBean("spanishLanguage");		
		System.out.println(strategy.readQuestions());
        System.out.println( "Hello World!" );
    }
}
