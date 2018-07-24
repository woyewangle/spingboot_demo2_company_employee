package com.example.demo.service;

import com.example.demo.DB.MemoryDB;
import com.example.demo.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 7:29 PM 7/24/2018
 * @Modified By:
 */
@Service
public class CompanyService {

    public final MemoryDB memoryDB;

    @Autowired
    public CompanyService(MemoryDB memoryDB) {
        this.memoryDB = memoryDB;
    }

    public List getCompanyList(){
        return memoryDB.getCompanyList();
    }

    public Company findCompanyById(int id) {
        return memoryDB.getCompanyList().stream().filter(e->e.getId()==id).collect(Collectors.toList()).get(0);
    }
}
