/*
* File: Employee.java
* Author: Takács Dániel
* Copyright: 2023, Takács Dániel
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/danieltakacs1/filbatle
* Licenc: GNU GPL
*/

package models;

public class Employee {
    String name;
    String city;
    String address;
    String birth;
    int salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
