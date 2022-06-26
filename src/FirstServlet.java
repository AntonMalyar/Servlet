import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.PrintWriter;

@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response){  
            try{  
                response.setContentType("text/html");  
                PrintWriter out = response.getWriter();  
                String userName = request.getParameter("userName");  
                out.print("Welcome to first Servlet " + userName);  
              
                //creating form that have invisible textfield  
                out.print("<form action='servlet2'>");  
                out.print("<input type='hidden' name='userName' value='"+userName+"'>");  
                out.print("<input type='submit' value='go to second servlet'>");  
                out.print("</form>");  
                out.close();  
      
            }
            catch(Exception e){
                System.out.println(e);
            }  
        }  
      
    }  
