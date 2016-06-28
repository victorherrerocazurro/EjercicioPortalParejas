package com.portal.parejas.presentacion.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletParejas
 */
//http://localhost:8080/PortalDeParejas/ServletParejas?key=parameter
@WebServlet("/ServletParejas")
public class ServletParejas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletParejas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String parameter = request.getParameter("key");
		

		//La peticion al negocio
		String dato = null;
		
		
		//PrintWriter out = response.getWriter();
		//out.println("<html>" + dato + "</html>");
		
		
		request.setAttribute("salida", dato);
		request.getRequestDispatcher("/WEB-INF/views/vista.jsp").forward(request, response);
		
	}

}
