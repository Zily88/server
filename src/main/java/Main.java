import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by Zily on 04.01.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Servlet servlet = new Servlet();

        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);

        context.addServlet(new ServletHolder(servlet), "/mirror");

        server.start();
        Thread.sleep(1000);
        System.out.println("Server started");

    }
}
