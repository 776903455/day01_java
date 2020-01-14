package day07_test;

public class Test5 {
    /*练习Math类的abs,ceil,ﬂoor,round方法
    *1. 打印8的绝对值
    * 2. 打印-9的绝对值
    * 3. 打印6.1向上取整的值
    * 4. 打印-6.1向上取整的值
    * 5. 打印6.8向下取整的值
    * 6. 打印-6.8向下取整的值
    * 7. 打印5.88四舍五入的值
    * 8. 打印-5.88四舍五入的值 */

    public static void main(String[] args) {

        System.out.println("打印8的绝对值 "+Math.abs(8));
        System.out.println("打印-9的绝对值  "+Math.abs(-9));
        System.out.println("打印6.1向上取整的值  "+Math.ceil(6.1));
        System.out.println("打印-6.1向上取整的值  "+Math.ceil(-6.1));
        System.out.println("打印6.8向下取整的值  "+Math.floor(6.8));
        System.out.println("打印-6.8向下取整的值  "+Math.floor(-6.8));
        System.out.println("打印5.88向下取整的值  "+Math.round(5.88));
        System.out.println("打印-5.88向下取整的值  "+Math.round(-5.88));

    }
}
