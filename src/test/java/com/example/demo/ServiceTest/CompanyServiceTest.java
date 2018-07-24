package com.example.demo.ServiceTest;

import com.example.demo.DB.MemoryDB;
import com.example.demo.entity.Company;
import com.example.demo.entity.Employee;
import com.example.demo.service.CompanyService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 7:50 PM 7/24/2018
 * @Modified By:
 */
public class CompanyServiceTest {

    public CompanyService companyService=new CompanyService(new MemoryDB());
    @Test
    public void should_return_all_company_When_call_getCompanyList() {
        List<Company> companyList= companyService.getCompanyList();
        Assert.assertEquals("[Company{id=1, name='小米', CompanyNumber=2}, Company{id=2, name='大米', CompanyNumber=3}]",
                companyList.toString());

    }


    @Test
    public void should_return_right_company_When_call_findCompanyById() {
        Company company= companyService.findCompanyById(1);
        Assert.assertEquals("Company{id=1, name='小米', CompanyNumber=2}",
                company.toString());

    }

    @Test
    public void should_add_Company_succeed_When_call_addCompany() {
        Company Company=new Company(3,"华为",2000);
        List<Company> CompanyList= companyService.addCompany(Company);
        System.out.println(CompanyList);
        Assert.assertEquals("[Company{id=1, name='小米', EmployeeNumber=2}, Company{id=2, name='大米', EmployeeNumber=3}, Company{id=3, name='华为', EmployeeNumber=2000}]",
                CompanyList.toString());
    }

    @Test
    public void should_delete_Company_succeed_When_call_deleteCompany() {
        List<Company> CompanyList= companyService.deleteCompany(2);
        Assert.assertEquals("[Company{id=1, name='小米', EmployeeNumber=2}]",
                CompanyList.toString());
    }
//
    @Test
    public void should_update_Company_succeed_When_call_updateCompany() {
        Company Company=new Company(1,"小米米",2000);
        Company newCompany= companyService.updateCompany(1,Company);
        Assert.assertEquals(newCompany.toString(),
                Company.toString());
    }

    @Test
    public void should_return_right_companyList_When_call_getCompanyByPage() {
        List<Company> companyList= companyService.getCompanyByPage(1,1);
        Assert.assertEquals("[Company{id=2, name='大米', EmployeeNumber=3}]",
                companyList.toString());
    }

    @Test
    public void should_return_all_employee_in_this_company_given_companyId_When_call_getEmployeesByCompanyId() {
        List<Employee> employeeList= companyService.getEmployeesByCompanyId(1);
        Assert.assertEquals("[Employee{id=0, name='小明', age=20, gender='male', salary=1000}]",
                employeeList.toString());
    }




}
