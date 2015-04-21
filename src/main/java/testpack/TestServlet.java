package testpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private String message;

    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World";
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		MonitoringAgent pAgent = (MonitoringAgent) getServletContext().getAttribute("pAgent");
		
		Random r = new Random();
//		pAgent.insertMetricValue("myNewMetric1", r.nextDouble()*100);
		
		long tstart = System.currentTimeMillis();
		doWork(r.nextInt(60));
		long telapsed = System.currentTimeMillis() - tstart;
		
//		pAgent.insertMetricValue("myNewMetric2", telapsed);
		
		 // Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + ": " + telapsed + "</h1>");
	}
	
	private void doWork(int t) {
		for (int i = 0; i < t*100000; i++)
			Math.tan(Math.atan(Math.tan(Math.atan(Math.tan(Math.atan(Math.tan(Math.atan(Math.PI))))))));
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
