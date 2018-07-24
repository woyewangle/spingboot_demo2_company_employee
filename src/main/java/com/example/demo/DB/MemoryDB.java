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

    public MemoryDB(ArrayList<Employees> employeesList, ArrayList<Company> companyList) {
        this.employeesList = employeesList;
        this.companyList = companyList;
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
