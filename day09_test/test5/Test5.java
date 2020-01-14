package day09_test.test5;

public class Test5 {
     /*定义一个父类Animal 包含name,weight属性和一个抽象的eat方法,
    定义两个子类Dog和Cat,Dog特有方法 lookHome,Cat特有方法catchMouse;
    并且重写eat方法,Dog吃骨头,Cat吃鱼 要求:使用多态形式创建Dog和Cat 对象,
    调用eat方法,并且使用向下转型,如果是Cat类型调用catchMouse功能,
    如果是Dog类型调用lookHome功 能*/
     public static void main(String[] args) {

         Animal dog=new Dog();
         Animal cat=new Cat();
         if(dog instanceof Dog) {
             dog.eat();
             ((Dog) dog).lookHome();
         }
         if(cat instanceof Cat) {
             cat.eat();
             ((Cat) cat).catchMouse();
         }
     }
}
