package fttt.fractaltris;

import java.io.*;

import fttt.fractaltris.htmlBuilder.HTMLBuilder;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "Home-servlet", value = "/home")
public class HomeServlet extends HttpServlet {
    HTMLBuilder pagerBuilder;
    public void init() {
        pagerBuilder = new HTMLBuilder(getServletContext());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println(pagerBuilder.getHTMLFile("home.html"));
    }

    public void destroy() {
    }
}