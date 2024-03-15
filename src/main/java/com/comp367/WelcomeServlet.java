package com.comp367;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.time.LocalTime;

public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Check if it's afternoon or evening
        if (currentTime.isBefore(LocalTime.of(18, 0))) {
            // Display afternoon greeting
            out.println("<html><head><title>Welcome</title></head><body>");
            out.println("<h1>Good afternoon!</h1>");
            out.println("<h2>Welcome to COMP367</h2>");
            out.println("</body></html>");
        } else {
            // Display evening greeting
            out.println("<html><head><title>Welcome</title></head><body>");
            out.println("<h1>Good evening!</h1>");
            out.println("<h2>Welcome to COMP367</h2>");
            out.println("</body></html>");
        }
    }
}
