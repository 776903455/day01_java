package day10_demo.demo06;

public class Demo6 {
    public static void main(String[] args) {

        /*String s="会游泳的学生";
        Person swim = getSwim(s);
        swim.swin();
        String s1="会游泳的老师";
        Person tea=getSwim(s1);
        tea.swin();*/
//        Student student=new Student();
//        new Test2(()-> System.out.println("学游泳的人")).studySwin(student);

      /*  Person person=(()-> System.out.println("游泳"));
        person.swin();*/

//     int sum= s(120,130,(a,b)->{
//          return a+b;
//      });
//        System.out.println(sum);
//

      /*  String str = studySwim("会游泳的学生", (s) -> {
            return s;
        });*/

      Person person=(s)->{return s;};
        String str = person.swin("会游泳的老师");
        System.out.println(str);

    }


   public static String studySwim(String s1,Person person){
        return person.swin(s1);

   }
    /*public static int s(int a,int b,SS ss){
        return  ss.sum(a,b);
    }*/


  /*  public static Person getSwim(String str){

        if ("会游泳的学生".equals(str)) {
            return new Student();
        }else if("会游泳的老师".equals(str)){
            return  new Teacher();
        }else {
            return null;
        }

    }*/
}

/*
class Test2{
    public Test2(Person person) {
        this.person = person;
    }

    private  Person person;
    public void studySwin(Person person){
        person.swin();

    }
}*/
