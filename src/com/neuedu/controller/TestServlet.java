package com.neuedu.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*req.setAttribute("key","value");
        req.getRequestDispatcher("aindex.jsp").forward(req,resp);
        HttpSession session =req.getSession();
        session.setAttribute("session","session");
        req.getRequestDispatcher("aindex.jsp").forward(req,resp);*/

        /*req.getServletContext().setAttribute("servletcontext","servletcontext");
        req.getRequestDispatcher("aindex.jsp").forward(req,resp);*/
        /*req.setAttribute("rel","vaule");
        resp.sendRedirect("www.baidu.com");*/





        /*resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.write("中文");*/
        /*System.out.println(req.getContextPath());
        System.out.println(req.getRequestURI() );
        System.out.println(req.getRequestURL());
        System.out.println(req.getServletPath());
        System.out.println(req.getCharacterEncoding());
        System.out.println(req.getContentType());
        System.out.println(req.getScheme());
        System.out.println(req.getServerName());
        System.out.println(req.getServerPort());*/

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getServletName());
        System.out.println(config.getServletContext());
        System.out.println(config.getInitParameter("t"));
    }

    @Override
    public void destroy() {
        System.out.println("destory");
    }
}
