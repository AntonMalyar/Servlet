
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        RequestDispatcher requestDispatcher;
  
        response.setContentType("text/html");  
        PrintWriter printWriter = response.getWriter();
          
        String myInput = request.getParameter("myInput");  
     
          
        if(myInput.equals("forward")) {  
            requestDispatcher = request.getRequestDispatcher("Servlet2");  
            requestDispatcher.forward(request, response);  
        }else{
            requestDispatcher = request.getRequestDispatcher("/index.html");
            requestDispatcher.forward(request, response);
        }
    }
}
