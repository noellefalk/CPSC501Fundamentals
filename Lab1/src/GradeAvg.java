public class GradeAvg {
	public static void main(String[] args) {
		double quizScore1 = 50;
		double quizScore2 = 47;
		double quizScore3 = 89;
		double testScore1 = 73;
		double testScore2 = 94;
		double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3) / 3;
		double testScoreAvg = (testScore1 + testScore2) / 2;
		System.out.printf("Average quiz score: %.2f\n", quizScoreAvg);
		System.out.printf("Average test score: %.2f", testScoreAvg);
	}
}
