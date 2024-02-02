import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> findGoodMatrix(ArrayList<ArrayList<Integer>> arr) {

		// Write your code here
		int rows = arr.size();
		int cols = arr.get(0).size();

		boolean[] zeroRows = new boolean[rows];
		boolean[] zeroCols = new boolean[cols];

		for(int i = 0;i<rows;i++){
			for(int j = 0;j<cols;j++){
				if(arr.get(i).get(j)==0){
					zeroRows[i]=true;
					zeroCols[j]=true;
				}
			}
		}
		for(int i = 0;i<rows;i++){
			for(int j = 0;j<cols;j++){
				if(zeroRows[i] || zeroCols[j]){
					arr.get(i).set(j, 0);
				}
			}
		}
		return arr;

	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		for(int t = 0;t<T;t++){
			int N = scanner.nextInt();
			int M = scanner.nextInt();

			ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
			for(int i = 0;i<N;i++){
				ArrayList<Integer> row = new ArrayList<>();
				for(int j = 0;j<M;j++){
					row.add(scanner.nextInt());
				}
				matrix.add(row);
			}
			ArrayList<ArrayList<Integer>> result = findGoodMatrix(matrix);

			for(ArrayList<Integer> row : result){
				for(int val : row){
					System.out.print(val + " ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
