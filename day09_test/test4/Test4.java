package day09_test.test4;

public class Test4 {
    /*两个手机类OldPhone和NewPhone都有call()和sendMessage()方法.定义接口Play,Play中
    有一个抽象的玩游 戏的方法playGame(),NewPhone实现Play接口有玩游戏的功能;
    要求:分别测试OldPhone和NewPhone的 call()和sendMessage()方法,
    再测试新手机palyGame()的方法 */
    public static void main(String[] args) {

            OldPhone oldPhone=new OldPhone();
            oldPhone.call();
            oldPhone.sendMessage();
           NewPhone newPhone=new NewPhone();
           newPhone.call();
           newPhone.sendMessage();
           newPhone.play();
    }
}
