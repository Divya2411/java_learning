package com.divya;

import java.lang.reflect.Method;

public class ReflectionAPI {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.divya.Test");
        Test t = (Test) c.newInstance();

        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(t, null);
    }
}
