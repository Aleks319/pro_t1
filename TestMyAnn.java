package hw.task1;

import java.lang.reflect.Method;


public class TestMyAnn {

    public static void main(String[] args) {

        Class<?> cls = MetSum.class;

        Method[]  m = cls.getMethods();
        try {
        for(Method mt: m) {
            if(mt.isAnnotationPresent(MyAnn.class)) {
                MyAnn an = mt.getAnnotation(MyAnn.class);
                MetSum ms = null;
                ms = (MetSum) cls.newInstance();
                ms.sum(an.a(), an.b());
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}