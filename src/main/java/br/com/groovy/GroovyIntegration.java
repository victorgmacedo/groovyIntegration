package br.com.groovy;

import br.com.groovy.abstracts.AnotherClass;
import br.com.groovy.interfaces.Process;
import groovy.lang.GroovyClassLoader;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class GroovyIntegration {

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
        Class clazz = groovyClassLoader.parseClass(new File("./ProcessImpl.groovy"));
        AnotherClass p = (AnotherClass) clazz.getConstructor().newInstance();
        p.setNome("Gabriel");
        System.out.println(p.process("victor"));
    }

}
