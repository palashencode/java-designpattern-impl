package com.java.app;

import java.util.regex.Pattern;

import com.java.app.abstract_factory.AbstractFactoryPattern;
import com.java.app.builder.BuilderPattern;
import com.java.app.decorator.DecoratorPattern;
import com.java.app.factory.FactoryPattern;
import com.java.app.prototype.PrototypePattern;
import com.java.app.strategy.StrategyPattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Java Design Pattern Implementations" );
        System.out.println( "===================================" );

        // Design Pattern to execute.
        // DESIGNPATTERN pattern = DESIGNPATTERN.DECORATOR;

        // DesignPattern pattern = new DecoratorPattern();
        // DesignPattern pattern = new FactoryPattern();
        // DesignPattern pattern = new StrategyPattern();
        // DesignPattern pattern = new BuilderPattern();
        // DesignPattern pattern = new PrototypePattern();
        DesignPattern pattern = new AbstractFactoryPattern();

        pattern.run();
        

    }
}
