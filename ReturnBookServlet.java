import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReturnBookServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException
    {
        req.setAttribute("msg", "Book Returned Successfully");
        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
