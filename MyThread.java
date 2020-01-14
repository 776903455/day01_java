
import java.util.ArrayList;
import java.util.List;

public class MyThread   {

    List list=new ArrayList();
    public static void main(String[] args) {

        new Thread();

    }

    public void adds(Object o){
        list.add(o);
    }

    public int getSize(){
        return list.size();
    }


}
