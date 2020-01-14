package day09_test.demo;

public class Demo2 {

    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.run();
        Usb mouseUsb=new Mouse();
        laptop.useUsb(mouseUsb);

        Usb keyUsb=new Keyboard();
        laptop.useUsb(keyUsb);
        laptop.shut();


    }
}
