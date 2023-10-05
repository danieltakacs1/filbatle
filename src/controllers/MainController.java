/*
* File: MainController.java
* Author: Takács Dániel
* Copyright: 2023, Takács Dániel
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/danieltakacs1/filbatle
* Licenc: GNU GPL
*/

package controllers;

import java.util.ArrayList;

import models.Employee;
import models.Filereader;
import views.MainConsole;

public class MainController {
    public MainController(){
        ArrayList<Employee> employeeList = new Filereader().loadData();

        new MainConsole().showData(employeeList);

    }
}
