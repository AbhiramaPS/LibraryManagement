import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddBookServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException
    {
        String id = req.getParameter("bid");
        String name = req.getParameter("bname");

        req.setAttribute("msg", "Book Added Successfully");
        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
