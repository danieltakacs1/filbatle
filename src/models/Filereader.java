/*
* File: Filereader.java
* Author: Takács Dániel
* Copyright: 2023, Takács Dániel
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/danieltakacs1/filbatle
* Licenc: GNU GPL
*/

package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
    
    final String filename = "filbt.txt";

    public ArrayList<Employee> loadData(){
        ArrayList<Employee> employeeList = null;
        try{
            employeeList = tryloadData();
        }   catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
        }
        return employeeList;
    }

    public ArrayList<Employee> tryloadData() throws FileNotFoundException{
        ArrayList<Employee> employeeList = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file, "utf-8");
        while(scanner.hasNext()) {
            Employee employee = new Employee();
            
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");
            employee.setName(lineArray[0]);
            employee.setCity(lineArray[1]);
            employee.setAddress(lineArray[2]);
            employee.setBirth(lineArray[3]);
            employee.setSalary(Integer.parseInt(lineArray[4]));
            employeeList.add(employee);
        }
        scanner.close();
        return employeeList;
    }
}
