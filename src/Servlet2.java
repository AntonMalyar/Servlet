import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  

        response.setContentType("text/html");  
        PrintWriter printWriter = response.getWriter();
        printWriter.write("Welcom to Second Servlet");  
    } 
}
