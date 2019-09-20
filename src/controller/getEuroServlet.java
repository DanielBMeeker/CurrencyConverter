package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DollarConverter;

/**
 * Servlet implementation class getEuroServlet
 */
@WebServlet("/getEuroServlet")
public class getEuroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getEuroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userDollars = request.getParameter("userDollars");
		DollarConverter userMoney = new DollarConverter(Double.parseDouble(userDollars));
		request.setAttribute("userBillfold", userMoney);
		getServletContext().getRequestDispatcher("/getEuroResult.jsp").forward(request, response);
		//PrintWriter writer = response.getWriter();
		//writer.println("You entered " + userMoney.toString());
		//writer.close();
	}

}
