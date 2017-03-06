package com.nicolas.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 不在Spring Boot的扫描包普通类调用bean
 * SpringUtil.java
 * @author nicolas 2017年3月6日--下午9:39:27
 *
 *
 */
public class SpringUtil implements ApplicationContextAware{

    private static ApplicationContext applicationContext = null;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
    	if(SpringUtil.applicationContext == null){
    		SpringUtil.applicationContext  = applicationContext;
    	}
    	System.out.println("---------------------------------------------------------------------");
    	System.out.println("---------------------------------------------------------------------");
    	System.out.println("---------------com.nicolas.spring.SpringUtil------------------------------------------------------");
    	System.out.println("========不在Spring Boot的扫描包的ApplicationContext配置成功,在普通类可以通过调用SpringUtils.getAppContext()获取applicationContext对象,applicationContext="+SpringUtil.applicationContext+"========");
    	System.out.println("---------------------------------------------------------------------");
    }
    
    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
    	return applicationContext;
    }

    //通过name获取 Bean.
    public static Object getBean(String name){
    	return getApplicationContext().getBean(name);
    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz){
    	return getApplicationContext().getBean(clazz);
    }
    
    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name,Class<T> clazz){
    	return getApplicationContext().getBean(name, clazz);
    }
}
