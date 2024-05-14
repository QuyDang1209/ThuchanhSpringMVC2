package com.cg.managercustomer;

import Model.Customers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name = "CustomerController", urlPatterns = "/customer")
public class CustomerController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "infor":
                showFormEdit(req,resp);
                break;
            default:

                showlistCustomer(req,resp);
                break;
        }
    }

    private void showFormEdit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int id = Integer.parseInt(req.getParameter("id")) ;
//        Customers customers = findCustomerById(id);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/edit.jsp");
        requestDispatcher.forward(req,resp);
    }

//    private Customers findCustomerById(int id) {
//        List<Customers> cus = new ArrayList<>();
//
//    }

    private void showlistCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
        req.setAttribute("customer",customers);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            showlistCustomer(req,resp);
        }
//        else {
//            sho
//        }
    }
}
