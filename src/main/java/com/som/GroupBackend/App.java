package com.som.GroupBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.som.Group.config.AppContextConfig;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContextConfig.class);
    }
}
