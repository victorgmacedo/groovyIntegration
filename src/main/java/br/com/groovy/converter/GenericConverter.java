package br.com.groovy.converter;

import java.lang.reflect.InvocationTargetException;

public class GenericConverter<T> {

    public T getInstance(Class clazz)throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return (T) clazz.getConstructor().newInstance();
    }

}
