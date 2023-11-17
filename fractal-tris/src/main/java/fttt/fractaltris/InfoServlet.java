package fttt.fractaltris;

import fttt.fractaltris.htmlBuilder.HTMLBuilder;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Info-servlet", value = "/info")
public class InfoServlet extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>How to play</h1><h3>work in progress</h3><a href='./home'>Go back to home</a>");
    }

    public void destroy() {
    }
}
