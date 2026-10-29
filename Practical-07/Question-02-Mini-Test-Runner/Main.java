import java.lang.annotation.*;import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD) @interface Run {}
class SampleTests { @Run void testOne(){System.out.println("testOne passed");} @Run void testTwo(){System.out.println("testTwo passed");} void helper(){System.out.println("helper not run");} }
public class Main { public static void main(String[] args)throws Exception{Object test=new SampleTests();int count=0;for(Method m:test.getClass().getDeclaredMethods())if(m.isAnnotationPresent(Run.class)&&m.getParameterCount()==0){m.invoke(test);count++;}System.out.println("Tests executed: "+count);} }
