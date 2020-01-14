package day09_test.demo;

public class Keyboard implements Usb {
    @Override
    public void open() {
        System.out.println("键盘使用usb，绿灯闪一闪");
    }

    @Override
    public void close() {
        System.out.println("键盘使用usb，绿灯灭");
    }
    public void keyboardClick(){
        System.out.println("键盘点击方法");
    }
}
