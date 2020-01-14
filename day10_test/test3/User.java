package day10_test.test3;

public class User {
    private  int uid;
    private String type;

    public User() {
    }

    public User(int uid) {
        this.uid = uid;
    }

    public User(int uid, String type) {
        this.uid = uid;
        this.type = type;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  uid +"-" + type ;

    }
}
