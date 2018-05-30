package org.cyk.playground.microservices.jboss;
import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
  
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
 
    private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("<html><p>Hi! Microservices from <h1>JBoss Swarm</h1> at " + new java.util.Date()+"</p></html>");
    }
}