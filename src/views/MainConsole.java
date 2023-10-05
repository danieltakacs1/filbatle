/*
* File: MainConsole.java
* Author: Takács Dániel
* Copyright: 2023, Takács Dániel
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/danieltakacs1/filbatle
* Licenc: GNU GPL
*/

package views;

import java.util.ArrayList;

import models.Employee;

public class MainConsole {
    
    public void showData(ArrayList<Employee> employeeList){
        for(Employee employee : employeeList) {
            System.out.println(employee.getName() + " ; " + employee.getCity() + " ; " + employee.getAddress() + " ; " + employee.getBirth() + " ; " + employee.getSalary());
        }
    }
}
