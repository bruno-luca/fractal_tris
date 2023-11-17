package fttt.fractaltris;

import java.io.*;
import java.util.Objects;

import fttt.fractaltris.htmlBuilder.HTMLBuilder;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "Home-servlet", urlPatterns = {"/home", "/home/login", "/home/signup"})
public class HomeServlet extends HttpServlet {
    HTMLBuilder pagerBuilder;
    public void init() {
        pagerBuilder = new HTMLBuilder(getServletContext());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String[] urlPath = request.getServletPath().split("/");
        if(urlPath.length == 2){
            out.println(pagerBuilder.getHTMLFile("home.html"));
        } else if(urlPath[2].equals("login")){
            out.println(pagerBuilder.getHTMLFile("login.html"));
        } else if(urlPath[2].equals("signup")){
            out.println(pagerBuilder.getHTMLFile("signup.html"));
        }
    }

    public void destroy() {
    }
}