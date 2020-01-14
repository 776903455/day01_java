package day10_test.test4;

public class Compare implements  CompareAble {

    @Override
    public Apple compare(Apple a1, Apple a2) {
        return a1.getSize()>a2.getSize()?a1:a2;
    }
}
