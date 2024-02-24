package com.comp367;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Welcome</title></head><body>");
        out.println("<h1>Welcome to COMP367</h1>");
        out.println("</body></html>");
    }
}
