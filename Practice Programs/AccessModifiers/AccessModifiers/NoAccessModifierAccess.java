
package AccessModifiers;

public class NoAccessModifierAccess
{
public static void main(String [] args)
{ 

// In NoAccessModifier class variable x is define as non static so in main static method we are calling variable using Object

NoAccessModifier test = new NoAccessModifier();
test.x=50;
System.out.println (test.x);
}
}