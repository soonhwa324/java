package ch07.home.ex04.case01;

public class MaxMin {
	public static void main(String[] args) {
		int[] scores = {77, 88, 91, 33, 100, 55, 95};
		
		int max = scores[0];
		int min = scores[0];
		
		for(int score: scores) {
			if(score > max) max = score;
			if(score < min) min = score;
		}
		/*
		for(int i = 0; i < scores.length - 1; i++) {
			if(scores[i] > scores[i + 1]) max = scores[i];
			if(scores[i] < scores[i + 1]) min = scores[i];
		}
		*/
		System.out.printf("%d %d", max, min);
	}
}
/*
과제: scores 에서 최고, 최소값을 찾아라.
*/