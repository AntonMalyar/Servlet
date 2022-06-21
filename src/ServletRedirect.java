import java.io.IOException;
  
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
  
@WebServlet("/redirect")
public class ServletRedirect extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
        resp.sendRedirect("https://www.google.com");
          
    }
  
}