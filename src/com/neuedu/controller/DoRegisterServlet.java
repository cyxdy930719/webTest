package com.neuedu.controller;

import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/doregister")
public class DoRegisterServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname=req.getParameter("unames");

        User u = new User();
        u=service.getOne(uname);
        if (u==null){
            resp.getWriter().write("1");
        }else{
            resp.getWriter().write("2");
        }
        /*String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        String pwds = req.getParameter("pwds");
        String tele = req.getParameter("tele");
        User u = new User();
        u.setUsername(username);
        u.setPassword(pwd);
        u.setTele(tele);
        if(pwd.equals(pwds)){
            service.insert(u);
            resp.sendRedirect("login");
        }*/

    }
}
