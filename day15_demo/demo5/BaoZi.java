package day15_demo.demo5;

public class BaoZi {
    private String name;
    private Integer kc=0;
    private Integer flge;
    private Integer sum=200;

    public BaoZi(String name, Integer kc, Integer flge) {
        this.name = name;
        this.kc = kc;
        this.flge = flge;
    }

    public BaoZi(String name, Integer flge) {
        this.name = name;
        this.flge = flge;
    }

    public BaoZi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKc() {
        return kc;
    }

    public void setKc(Integer kc) {
        this.kc = kc;
    }

    public Integer getFlge() {
        return flge;
    }

    public void setFlge(Integer flge) {
        this.flge = flge;
    }
}
