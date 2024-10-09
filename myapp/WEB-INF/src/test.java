package bec.com;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class test extends HttpServlet {
    
    	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<b>Printed by out object</b> Hi welcome");

    }
}
