package day10_test.test4;

public class Worker {
   public Apple pickApple(CompareAble compareAble,Apple a1,Apple a2){
       Apple newApple=compareAble.compare(a1,a2);
       /*System.out.println("挑选大的：");
       Apple newApple=compareAble.compare(a1,a2);
       System.out.println(newApple.getSize()+"-"+newApple.getColor());
       System.out.println("挑选红的：");*/
//        if("红色".equals(a1.getColor())){
//            System.out.println(a1.getSize()+"-"+a1.getColor());
//        }else{
//            System.out.println(a2.getSize()+"-"+a2.getColor());
//        }
        return newApple;
    }
}
