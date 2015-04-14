package testpack;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import eu.paasport.services.monitoring.agent.MonitoringAgent;
//import eu.paasport.services.monitoring.agent.exceptions.MonitoringException;

public class ServletListener implements ServletContextListener{

    public void contextInitialized(ServletContextEvent event){
    	ServletContext sc = event.getServletContext();  	

//    	try {
//			MonitoringAgent agent = new MonitoringAgent();
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