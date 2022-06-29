import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.PrintWriter;

@WebServlet("/servletWithFilter")
public class ServletWithFilter extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
      
        out.print("<br>welcome to servlet<br>");  
    }
}
