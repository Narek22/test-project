package com.narek;

import com.narek.annotation.InjectRandomDouble;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;

public class InjectRandomDoubleBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        final Field[] declaredFields = bean.getClass().getDeclaredFields();
        for(Field field : declaredFields) {
            final InjectRandomDouble annotation = field.getAnnotation(InjectRandomDouble.class);
            if(annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = min + random.nextInt(max - min);
                ReflectionUtils.setField(field, bean, value);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
