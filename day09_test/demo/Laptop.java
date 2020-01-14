package day09_test.demo;

public class Laptop  {


    public void run(){
        System.out.println("运行功能");
    }
    public  void shut(){
        System.out.println("关机功能");
    }

    public void useUsb(Usb usb){
        usb.open();
        if(usb instanceof Mouse ){
          Mouse m=(Mouse) usb;
          m.mouseClick();
        }else if(usb instanceof Keyboard){
            Keyboard k=(Keyboard)usb;
            k.keyboardClick();
        }
        usb.close();
    }

}
