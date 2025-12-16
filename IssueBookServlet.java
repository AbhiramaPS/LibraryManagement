import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class IssueBookServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException
    {
        req.setAttribute("msg", "Book Issued Successfully");
        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
