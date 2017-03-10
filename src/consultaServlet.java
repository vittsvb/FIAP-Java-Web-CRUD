

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/consultaServlet")
public class consultaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public consultaServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String cpfFunc = request.getParameter("cpfFunc");
		
		List<Funcionario> funcs = (List<Funcionario>) request.getSession().getAttribute("lista");
		
		for (Funcionario funcionario : funcs) {
			if(funcionario.getCpf().equals(cpfFunc)){
				request.setAttribute("funcionario", funcionario);
			}
		}
		
		request.getRequestDispatcher(new String("funcionario.jsp")).forward(request, response);

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
