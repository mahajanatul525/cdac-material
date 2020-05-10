package mypack;
public class SpringContest implements Contest 
{
	@Override
	public String promptQuestion() 
	{
		return "Who invented Spring?";
	}
}
