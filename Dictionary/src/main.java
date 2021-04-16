import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordList obj=new WordList();
		obj.createVocabulary();
		System.out.println("Method 1");
		obj.display();
		System.out.println("");
		System.out.println("Method 2");
		obj.display2();
		System.out.println("");
		
		String big=obj.getKeyMax();
		System.out.println(big);
		
		System.out.println("Is Beer contained in the list ?");
		String word="Beer";
		boolean result=obj.checkWord(word);
		System.out.println(result);
		System.out.println("");
		
		System.out.println("Is apple contained in the list ?");
		String word2="apple";
		boolean result2=obj.checkWord(word2);
		System.out.println(result2);
		System.out.println("");
		
		System.out.println("Is APPLE contained in the list ?");
		boolean result3=obj.checkWord("APPLE");
		System.out.println(result3);
		System.out.println("");
		
		String wordadd1="anti";
		obj.addWord(wordadd1);
		System.out.println("After adding"+ " anti");
		obj.display();
		System.out.println("");
		String wordadd2="zoo";
		obj.addWord(wordadd2);
		System.out.println("After adding" +" zoo");
		obj.display();
		System.out.println("");
		
		
		//get words that have the same first letter
		System.out.println("Words that begin with letter A");
		ArrayList<String>wordA=obj.getWords("A");
		System.out.println("A -> " +wordA);
		System.out.println("");
		
		System.out.println("Words that begin with letter B");
		ArrayList<String> wordB=obj.getWords("B");
		System.out.println("B -> " +wordB);
		System.out.println("");
		
		System.out.println("Words that begin with letter D");
		ArrayList<String> wordD=obj.getWords("D");
		System.out.println("D - > " + wordD);
		System.out.println("");
		
		System.out.println("Remove Apple");
		obj.deleteWord("Apple");
		obj.display();
		System.out.println("");
		
		System.out.println("Remove zoo");
		obj.deleteWord("zoo");
		obj.display();
		System.out.println("");
		
		System.out.println("Remove Book");
		obj.deleteWord("Book");
		obj.display();
		System.out.println("");
		
		System.out.println("Biggest key");
		String keyMax = obj.getKeyMax();
		System.out.println(keyMax);
		System.out.println("");
	}

}
