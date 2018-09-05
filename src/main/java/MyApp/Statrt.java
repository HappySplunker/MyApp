package MyApp;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.*;
import javax.servlet.descriptor.JspConfigDescriptor;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

public class Statrt {
    public static void main(String[] args) throws Exception {
        Frontend frontend = new Frontend();
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler (ServletContextHandler.SESSIONS); {
           server.setHandler(context);
           context.addServlet(new ServletHolder(frontend), '/authform');
        server.start();
        server.join();
        }
    }
}
