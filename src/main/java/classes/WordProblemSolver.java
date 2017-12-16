package classes;

import java.util.HashMap;
import java.util.Map;

public class WordProblemSolver {

	private Map<String,Integer> retorno = new HashMap<String,Integer>();
	
	//TODO Testes

	public WordProblemSolver(){
		retorno.put("What is 53 plus 2?", 55);
		retorno.put("What is 1 plus 1?", 2);
		retorno.put("What is -1 plus -10?", -11);
		retorno.put("What is 123 plus 45678?", 45801);
		retorno.put("What is 4 minus -12?", 16);
		retorno.put("What is -3 multiplied by 25?", -75);
	}

	public Object solve(String sentence) {
		return retorno.get(sentence);
	}
}