package com.cg.managercustomer;

import Model.Customers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller

public class ManagerController {
    @RequestMapping("/listcustomer")
    public String showlist(HttpServletRequest request){
        List<Customers> customers = new ArrayList<>();
        Customers customers1 = new Customers(1,"Nguyen Khac Nhat", "nhat@codegym.vn","HaNoi");
        Customers customers2 = new Customers(2,"Dang Huy Hoa", "hoa.dang@codegym.vn","Da Nang");
        Customers customers3 = new Customers(3,"Le Thi Chau", "chau.le@codegym.vn","Hue");
        Customers customers4 = new Customers(4,"Nguyen Thuy Duong", "duong.nguyen@codegym.vn","Sai gon");
        Customers customers5 = new Customers(5,"CodeGym", "code@codegym.vn","HaNoi");
        customers.add(customers1);
        customers.add(customers2);
        customers.add(customers3);
        customers.add(customers4);
        customers.add(customers5);
        request.setAttribute("customer", customers);
        return "list";
    }
}
