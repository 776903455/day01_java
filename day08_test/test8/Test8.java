package day08_test.test8;

public class Test8 {
    /*1. 在小米科技有很多员工(Employee),按照工作内容不同分教研部员工(Teacher)和行政部员工(AdminStaff)
    2. 教研部根据教学的方式不同又分为讲师(Lecturer)和助教(Tutor)
    3. 行政部根据负责事项不同,又分为维护专员(Maintainer),采购专员(Buyer)
    4. 公司的每一个员工都编号,姓名和其负责的工作
    5. 每个员工都有工作的功能,但是具体的工作内容又不一样,在向上抽取的时候定义为抽象方法*/
    public static void main(String[] args) {

        Lecturer lecturer=new Lecturer("666","傅红雪");
        lecturer.work();
        Tutor tutor=new Tutor("668","顾绮");
        tutor.work();
        Maintainer maintainer=new Maintainer("686","庖丁");
        maintainer.work();
        Buyer buyer =new Buyer("888","景甜");
        buyer.work();
    }
}
