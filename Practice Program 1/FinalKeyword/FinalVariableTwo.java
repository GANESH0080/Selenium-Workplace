
public class FinalVariableTwo {
final int speedlimit = 400;

void run ()
{
	speedlimit = 500;	
}
public static void main(String[] args)
{
	FinalVariableTwo test =  new FinalVariableTwo();
	test.run();
}
}
