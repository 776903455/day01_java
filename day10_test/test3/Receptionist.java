package day10_test.test3;

public class Receptionist{
    private  Filter filter;


    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }




    public  void Reception(User user){

        if (user.getType()!=null){return;}
        if(filter!=null){filter.filterUser(user);return;}
        if (user.getType()==null){user.setType("A");}



    }
}
