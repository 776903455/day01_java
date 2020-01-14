package day09_test.test3;

public interface AA {
    void showA();
    default  void show10B(String s){
        for(int i=0;i<10;i++){
            System.out.print(s+" ");
        }
    }
    default  void show10C(String s1){
        for(int i=0;i<10;i++){
            System.out.print(s1+" ");
        }
    }


}
