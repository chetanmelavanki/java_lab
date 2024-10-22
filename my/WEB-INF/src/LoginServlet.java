package bec.com;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;  // Corrected this import

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // Retrieve form parameters
        String username = req.getParameter("username");
        String pw = req.getParameter("pw");

        // Basic response output
        out.println("Login successful");
    }
}
