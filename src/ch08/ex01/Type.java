package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)//source 클래스엔 없고 자바에만있겠다
@Target(ElementType.TYPE)
public @interface Type {// @을 붙
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@interface Field{
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor{
	int value() default 0;
}

@Target(ElementType.METHOD)
@interface Method{
	
}

@Target(ElementType.PARAMETER)
@interface Param{
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation{
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal{
	
}