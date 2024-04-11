import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class AroundAdv implements MethodInterceptor{

	public Object invoke(MethodInvocation mi) throws Throwable {  
        Object obj;  
        System.out.println("additional concern before actual logic");  
        obj=mi.proceed();  
        System.out.println("additional concern after actual logic");  
        return obj;  
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
}
