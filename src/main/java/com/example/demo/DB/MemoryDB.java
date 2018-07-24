package com.example.demo.DB;

import com.example.demo.entity.Company;
import com.example.demo.entity.Employees;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 6:57 PM 7/24/2018
 * @Modified By:
 */
@Component
public class MemoryDB {
    public ArrayList<Employees> employeesList=new ArrayList<>();
    public ArrayList<Company> companyList=new ArrayList<>();

    public MemoryDB(){
        companyList.add(new Company(1,"小米",2));
        companyList.add(new Company(2,"大米",3));
        employeesList.add(new Employees(0,"小明",20,"男",1000));
        employeesList.add(new Employees(1,"小红",19,"女",2000));
        employeesList.add(new Employees(2,"小智",15,"男",3000));
        employeesList.add(new Employees(3,"小刚",16,"男",4000));
        employeesList.add(new Employees(4,"小霞",15,"女",5000));

    }


    public ArrayList<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }
}
