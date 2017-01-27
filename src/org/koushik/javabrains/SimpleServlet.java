package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet( description = "A simple servlet", urlPatterns = { "/AdvancedServlet" }, initParams = {
        @WebInitParam( name = "defaultUser", value = "John Doe" ) } )
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        response.setContentType( "text/html" );
        PrintWriter out = response.getWriter();
        String userName = request.getParameter( "username" );
        HttpSession session = request.getSession();
        ServletContext context = request.getServletContext();
        if ( userName != "" && userName != null ) {
            session.setAttribute( "savedUser", userName );
            context.setAttribute( "savedUser", userName );
        }
        out.println( "Request paramater has user as " + userName + "<br/>" );
        out.println( "Session paramater has user as " + session.getAttribute( "savedUser" ) + "<br/>" );
        out.println( "Context paramater has user as " + context.getAttribute( "savedUser" ) + "<br/>" );
        out.println(
                "Init paramater has default user as " + getServletConfig().getInitParameter( "defaultUser" ) );
    }

}
