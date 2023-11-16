package fttt.fractaltris.login;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Login-Service", urlPatterns = {LoginService.LOGIN_PATH, LoginService.SIGNUP_PATH, LoginService.LOGOUT_PATH})
public class LoginServlet extends HttpServlet {
    public void doInit(){

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }
}
