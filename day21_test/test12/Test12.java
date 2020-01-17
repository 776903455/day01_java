package day21_test.test12;

import com.shop.Test;

import java.lang.reflect.Method;

public class Test12 {
    /*定义一个注解：Book *
     包含属性：String value()   书名 *
     包含属性：double price()  价格，默认值为 100 *
     包含属性：String[] authors() 多位作者
    1. 定义类在成员方法上使用Book注解
    2. 解析获得该成员方法上使用注解的属性值。*/

    public static void main(String[] args) throws NoSuchMethodException {

        Class<TestBook> c=TestBook.class;
        Method method=c.getMethod("showBook");
        if(method.isAnnotationPresent(Book.class)) {
            Book book=method.getAnnotation(Book.class);

            System.out.println("书名："+book.value()+",价格："+book.price()+",作者:"+book.authors()[0]);
        }

    }

}

class TestBook{

    @Book(value = "红楼梦",authors = {"曹雪芹","xxx"})
    public void showBook(){}
}
