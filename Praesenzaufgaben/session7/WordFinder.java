package session7;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordFinder {
	private static final String FILE_PATH = "words.txt";
	
	public String chooseRandomWordFromFile(int length) {
		List<String> matchingWords = new ArrayList<>();
		List<String> otherWords = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))){
			String line;
			while((line = br.readLine()) !=null) {
				if(line.trim().length() == length) {
					matchingWords.add(line.trim());
				}else {
					otherWords.add(line.trim());
				}
			}
		} catch (IOException e) {
			System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
			return null;
		}
		
		if(matchingWords.isEmpty()) {
			return null;
		}
		
		Random random = new Random();
		String selectedWord = matchingWords.get(random.nextInt(matchingWords.size()));
		
		try(BufferedWriter bw =)
		
	}

}
