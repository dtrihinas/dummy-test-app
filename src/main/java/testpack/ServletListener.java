package testpack;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import eu.paasport.services.monitoring.agent.MonitoringAgent;
import eu.paasport.services.monitoring.agent.exceptions.MonitoringException;

public class ServletListener implements ServletContextListener{

    public void contextInitialized(ServletContextEvent event){
    	ServletContext sc = event.getServletContext();  	

    	try {
    		HashMap<String,String> params = new HashMap<String,String>();
			params.put("api.key", "9876");
			params.put("app.name", "myappopenshift");
			params.put("agent.name", "myagent");
			params.put("server.endpoint", "http://83.212.86.242");
			//params.put("agent.logging", "true");
			
			MonitoringAgent agent = new MonitoringAgent(params);
	    	sc.setAttribute("agent", agent);
		} 
    	catch (MonitoringException e) {
			e.printStackTrace();
		}
    	    
    	System.out.println("ServletListener>> Up and Running");
    }
 
    public void contextDestroyed(ServletContextEvent arg0) {
       ;
    }
}