package day10_test.test2;

import java.util.ArrayList;
import java.util.Objects;

public class Couse {
    private String couseName;
    private String teachName;
    private ArrayList<Student> arrayList=new ArrayList<>();

    public Couse() {
    }

    public Couse(String couseName, String teachName, ArrayList<Student> arrayList) {
        this.couseName = couseName;
        this.teachName = teachName;
        this.arrayList = arrayList;
    }

    public String getCouseName() {
        return couseName;
    }

    public void setCouseName(String couseName) {
        this.couseName = couseName;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public ArrayList<Student> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }

    public void show(){
        System.out.println("课程名称:"+couseName);
        System.out.println("授课老师:"+teachName);
        for(Student student:arrayList){
            System.out.println(student.getName()+":"+student.getStatus());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Couse couse = (Couse) o;
        return Objects.equals(couseName, couse.couseName) &&
                Objects.equals(teachName, couse.teachName) &&
                Objects.equals(arrayList, couse.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couseName, teachName, arrayList);
    }
}
