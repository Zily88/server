/**
 * Created by Zily on 04.01.2016.
 */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet{

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        Map<String, Object> pageVariables = new HashMap<>();
        response.setContentType("text/html;charset=utf-8");
        pageVariables.put("value", request.getParameter("key"));
        if(!request.getParameterMap().containsKey("key")){
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);}

        else {
        response.getWriter().println(PageGenerator.getPage("Page.html", pageVariables));
        response.setStatus(HttpServletResponse.SC_OK);}
    }
}
