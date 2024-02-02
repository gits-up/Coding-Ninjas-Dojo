import java.util.* ;
import java.io.*; 
public class Solution {
	public static int slotScore(String original, String guess) {
		// Write your code here.
		int perfectHits = 0;
		int pseudoHits = 0;

		for(int i = 0; i<original.length(); i++){
			if(original.charAt(i)==guess.charAt(i)){
				perfectHits += 2;
			}
		}

		Map<Character, Integer> originalCount = new HashMap<>();
		Map<Character, Integer> guessCount = new HashMap<>();

		for (int i = 0; i<original.length(); i++){
			char originalChar = original.charAt(i);
			char guessChar = guess.charAt(i);

			if(originalChar != guessChar){
				originalCount.put(originalChar, originalCount.getOrDefault(originalChar, 0)+1);
				guessCount.put(guessChar, guessCount.getOrDefault(guessChar, 0)+1);

			}
		}

		for(char color: guessCount.keySet()){
			if(originalCount.containsKey(color)){
				pseudoHits += Math.min(originalCount.get(color), guessCount.get(color));
			}
		}
		return perfectHits + pseudoHits;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		scanner.nextLine();

		for(int t = 0; t<T; t++){
			String original = scanner.nextLine();
			String guess = scanner.nextLine();

			int result = slotScore(original, guess);
			System.out.println(result);
		}
		scanner.close();
	}
}
