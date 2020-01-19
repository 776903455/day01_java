package day21_demo.demo4;

import org.junit.Test;

import java.lang.reflect.Method;

public class Demo4 {

    public static void main(String[] args) throws NoSuchMethodException {
     Class c= Product.class;
     Method method=c.getMethod("showProdct");
     if(method.isAnnotationPresent(ShowProduct.class)){
         ShowProduct showProduct=method.getAnnotation(ShowProduct.class);
         System.out.println(showProduct.price()+"-"+showProduct.name()+"-"+showProduct.number());
     }else{
         System.out.println("此方法上没有注解");
     }

    }

@Test
    public void fun1(){
        byte b=1;
        b=1+2;
}

}




