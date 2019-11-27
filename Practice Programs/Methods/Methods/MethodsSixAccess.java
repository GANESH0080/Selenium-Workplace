//Private Methods are not access in other class some time it Access using Reflection import

package Methods;
import java.lang.reflect.Method;  
public class MethodsSixAccess{  
public static void main(String[] args)throws Exception{  
  
    Class c = Class.forName("MethodsSix");  
    Object o= c.newInstance();  
    Method m =c.getDeclaredMethod("message", null);  
    m.setAccessible(true);  
    m.invoke(o, null);  
}  
}  