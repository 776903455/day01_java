package day09_test.demo;

public class Mouse implements  Usb {
    @Override
    public void open() {
        System.out.println("鼠标使用usb，红灯闪一闪");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭usb，红灯灭");
    }

    public void mouseClick(){
        System.out.println("鼠标点击方法");
    }
}
