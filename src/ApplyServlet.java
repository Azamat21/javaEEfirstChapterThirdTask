



import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(value = "/apply")

public class ApplyServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         String name = request.getParameter("user_name");
         String surname = request.getParameter("user_surname");
        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class='mx-auto' style='width:280px'>");
        out.print("<h1 class='text-justify text-align'>"+"Hello "+name+" "+surname+"!</h1>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }



    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        System.out.println("This is Apply page");


    }

}