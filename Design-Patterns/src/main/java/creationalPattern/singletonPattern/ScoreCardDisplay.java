package creationalPattern.singletonPattern;

public class ScoreCardDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreCard scoreCard=ScoreCard.getScoreCard();
		scoreCard.showScoreCard();
	}

}
