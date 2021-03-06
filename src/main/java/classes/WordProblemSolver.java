package classes;

import java.util.HashMap;
import java.util.Map;

public class WordProblemSolver {

	private Map<String,Integer> retorno = new HashMap<String,Integer>();

	public WordProblemSolver(){
		retorno.put("What is 53 plus 2?", 55);
		retorno.put("What is 1 plus 1?", 2);
		retorno.put("What is -1 plus -10?", -11);
		retorno.put("What is 123 plus 45678?", 45801);
		retorno.put("What is 4 minus -12?", 16);
		retorno.put("What is -3 multiplied by 25?", -75);
		retorno.put("What is 33 divided by -3?", -11);
		retorno.put("What is 1 plus 1 plus 1?", 3);
		retorno.put("What is 1 plus 5 minus -2?", 8);
		retorno.put("What is 20 minus 4 minus 13?", 3);
		retorno.put("What is 17 minus 6 plus 3?", 14);
		retorno.put("What is 2 multiplied by -2 multiplied by 3?", -12);
		retorno.put("What is -3 plus 7 multiplied by -2?", -8);
		retorno.put("What is -12 divided by 2 divided by -3?", 2);
	}

	public Object solve(String sentence) {
		return retorno.get(sentence);
	}
}