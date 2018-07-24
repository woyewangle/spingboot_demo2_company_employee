package com.example.demo.service;

import com.example.demo.DB.MemoryDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
