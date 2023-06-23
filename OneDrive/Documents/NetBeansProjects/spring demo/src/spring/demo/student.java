
package spring.demo;

import org.springframework.stereotype.Component;

@Component
public class student {

    public student() {
    }

    public student(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    private int roll;
    private String name;
    private String address;
}
