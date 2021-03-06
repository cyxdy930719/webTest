package com.neuedu.controller;

import com.neuedu.pojo.Product;
import com.neuedu.service.IProductService;
import com.neuedu.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/doupdate")
public class DoUpdateServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String des = req.getParameter("des");
        String url = req.getParameter("url");
        int id =Integer.parseInt(req.getParameter("id"));
        Product p = new Product();
        p.setProduct_id(id);
        p.setProduct_name(name);
        p.setPrice(price);
        p.setProduct_des(des);
        p.setUrl(url);
        service.update(p);
        resp.sendRedirect("list");
    }
}
