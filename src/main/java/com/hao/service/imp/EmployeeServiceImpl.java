package com.hao.service.imp;

import com.hao.service.EmployeeService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Company:
 * @version: 1.0
 * @date 2021/1/20 - 11:15
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List getAll() {
        List employees = sessionFactory.openSession().createQuery("FROM Employee").list();
        sessionFactory.close();
        return employees;

    }
}
