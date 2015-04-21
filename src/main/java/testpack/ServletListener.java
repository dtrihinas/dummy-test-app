package testpack;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletListener implements ServletContextListener {
	
    public void contextInitialized(ServletContextEvent event) {
    	ServletContext sc = event.getServletContext();  	

    	
//    	try {
//    		HashMap<String,String> params = new HashMap<String,String>();
//			params.put("api.key", "123456789");
//			params.put("app.name", "myapp1");
//			params.put("agent.name", "myagent");
//			params.put("server.endpoint", "localhost");
//			
//			MonitoringAgent agent = new MonitoringAgent(params);
//	    	sc.setAttribute("agent", agent);
//		} 
//    	catch (MonitoringException e) {
//			e.printStackTrace();
//		}
    	    
    	System.out.println("ServletListener>> Up and Running");
    }
 
    public void contextDestroyed(ServletContextEvent arg0) {
       ;
    }
}