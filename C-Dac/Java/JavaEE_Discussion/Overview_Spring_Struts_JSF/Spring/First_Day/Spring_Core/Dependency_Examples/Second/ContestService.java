package mypack;
public class ContestService
{
	private Contest contest;
	public void setContest(Contest contest)
	{
		this.contest=contest ;
	}

	public void askQuestion()
	{
		System.out.println(contest.promptQuestion());
	}
}

