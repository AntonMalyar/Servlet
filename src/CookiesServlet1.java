import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/CookiesServlet1")
public class CookiesServlet1 extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();

        String userName = req.getParameter("userName");
        printWriter.write("Welcome to Servlet 1 " + userName);

        Cookie userCookie = new Cookie("userName", userName);
        resp.addCookie(userCookie);

        printWriter.close();
    }
}