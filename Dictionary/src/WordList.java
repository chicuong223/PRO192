import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class WordList {
	HashMap<String, ArrayList<String>> list;
	public WordList() {
		list = new HashMap<String, ArrayList<String>>();
	}
	
	public void createVocabulary() {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Apple");
		a1.add("Arm");
		a1.add("Ant");
		list.put("A", a1);
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Book");
		a2.add("Bear");
		a2.add("Bring");
		a2.add("Boredom");
		a2.add("Band");
		list.put("B", a2);
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("Car");
		a3.add("Crown");
		list.put("C", a3);
	}
	public void display() {
		Set<String> keys=list.keySet(); //return keys A, B, C
		for (String key : keys) {
			ArrayList<String> tmp=list.get(key);
			System.out.println(key + " -> " + tmp);
		}
	}
	
	//method 2
	//Search in values only
	public void display2() {
		Collection<ArrayList<String>> value=list.values();
		for (ArrayList<String> arrayList : value) {
			System.out.println(value);
		}
	}
	//check whether a word is contained in the list
	public boolean checkWord(String word) {
		//TODO
		String tmp = ("" +word.charAt(0)).toUpperCase(); //get the first letter of word, change it to upper-case
		ArrayList<String> key=list.get(tmp);  //convert tmp to key
		if(key==null) return false;
		//if(key.contains(word)) return true;
		for (String string : key) {
			if(string.equalsIgnoreCase(word)) return true;
		}
		return false;
	}
	//get a list of words of list given the first letter
	public ArrayList<String> getWords(String begin){
		//TODO
		ArrayList<String>tmp = list.get(begin.toUpperCase());
		return tmp;
	}
	
	//add a word into list
	public void addWord(String word) {
		//TODO
		//cut the first letter of word, change to upper-case
		//2. use get(firstLetter) to get a key of first letter
		//if 2 returns a list -> add word to list
		//if 2 returns null -> add the word to a new key
		boolean check=checkWord(word);
		if(!check) {
			//get first letter, to upper-case
			String begin=("" + word.charAt(0)).toUpperCase();
			ArrayList<String> tmp=list.get(begin); //begin = key
			//if key doesn't exist
			if(tmp==null) {
				tmp=new ArrayList<String>(); //create a new key
				tmp.add(word);	//a the word to the key
				list.put(begin, tmp);  //put the key to the list
			}
			else {
				tmp.add(word);
			}
		}
	}
	
	//delete a word from list
	//if after deleting, a key size is 0, remove that key
	public void deleteWord(String word) {
		//TODO
		boolean check=checkWord(word);
		if(check) {
			String firstLetter=String.valueOf(word.toUpperCase().charAt(0));
			ArrayList<String>tmp = list.get(firstLetter);
			tmp.remove(word);
			if(tmp.size()==0) list.remove(firstLetter);
		}
	}
	
	//find the key which has the biggest number of words
	//return A because A is biggest
	public String getKeyMax() {
		//TODO
		String keyMax="";
		int max=0;
		//get keys from the list
		Set<String> ks=list.keySet();
		for (String k : ks) {
			ArrayList<String> tmp=list.get(k);
			if(tmp.size()>max) {
				keyMax=k;
				max=tmp.size();
			}
		}
		return keyMax;
	}
}
