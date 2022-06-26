import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.PrintWriter;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response){  
            try{  
                response.setContentType("text/html");  
                PrintWriter out = response.getWriter();  
              
                //Getting the value from the hidden field  
                String userName = request.getParameter("userName");  
                out.print("Welcom to second Servlet "+ userName);  
      
                out.close();  
            }
            catch(Exception e){
                System.out.println(e);
            }  
        }  
    }  