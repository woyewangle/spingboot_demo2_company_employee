package com.example.demo.controller;

import com.example.demo.DB.MemoryDB;
import com.example.demo.entity.Company;
import com.example.demo.service.CompanyService;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 7:02 PM 7/24/2018
 * @Modified By:
 */
@RestController
public class CompanyController {

    @Autowired
    public CompanyService companyService;

    @GetMapping("/companies")
    public List getCompanyList(){
        return companyService.getCompanyList();
    }

    @GetMapping("/companies/{id}")
    public Company findCompanyById(@PathVariable int id){
        System.out.println(companyService.findCompanyById(id));
        return companyService.findCompanyById(id);
    }

}
