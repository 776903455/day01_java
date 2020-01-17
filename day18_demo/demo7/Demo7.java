package day18_demo.demo7;


import java.lang.reflect.Method;

public class Demo7 {


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class<BookTest> c=BookTest.class;
        Book book1 = c.getAnnotation(Book.class);
        String value = book1.value();
        System.out.println(value);

        Method method=c.getMethod("showBook");
        Book book = method.getAnnotation(Book.class);
        System.out.println(book.price()+"-"+book.value()+"-"+book.authors());

    }
}
