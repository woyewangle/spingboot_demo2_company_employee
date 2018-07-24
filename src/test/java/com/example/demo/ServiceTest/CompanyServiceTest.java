package com.example.demo.ServiceTest;

import com.example.demo.DB.MemoryDB;
import com.example.demo.entity.Company;
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
        Assert.assertEquals("[Company{id=1, name='小米', employeesNumber=2}, Company{id=2, name='大米', employeesNumber=3}]",
                companyList.toString());

    }


    @Test
    public void should_return_right_company_When_call_findCompanyById() {
        Company company= companyService.findCompanyById(1);
        Assert.assertEquals("Company{id=1, name='小米', employeesNumber=2}",
                company.toString());

    }


}
