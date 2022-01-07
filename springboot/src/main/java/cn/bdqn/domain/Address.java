package cn.bdqn.domain;

public class Address {

    private String name;

    private String door;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", door='" + door + '\'' +
                '}';
    }
}
