package day08_test.test8;

public abstract class Employees {



    private String  id;
    private String name;

    public Employees(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employees() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void work();
}
