package exceptionhandling;

public class CustomExeception {

	public static void main(String[] args) throws VotingException {
		int age=17;
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException("age under 18!!!");
		}
	}

}
