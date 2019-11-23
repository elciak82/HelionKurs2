package serializable;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 12349876543213L; //wersja klasy serializowanej, jest to generowane

    public String name;
    public String address;
    public int pin;

    public Employee (String name, String address, int pin) {
        this.name = name;
        this.address = address;
        this.pin = pin;
    }

}
