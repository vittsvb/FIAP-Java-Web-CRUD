
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

@WebServlet("/cadastroServlet")
public class cadastroServlet extends HttpServlet {

	public cadastroServlet() {
		super();
	}
	List<Funcionario> listaFunc = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url;

		try {
			// RECEBE OS PARAMETROS
			String cpf = request.getParameter("txtCpf");
			String nome = request.getParameter("txtNome");

			int idade = Integer.parseInt(request.getParameter("idade"));
			Double salario = Double.parseDouble(request.getParameter("salario"));

			request.getSession().setAttribute("lista", listaFunc);
			Funcionario func = new Funcionario(cpf, nome, idade, salario);

			listaFunc = func.adicionar(listaFunc, func);

			listaFunc = (List<Funcionario>) request.getSession().getAttribute("lista");

			// listaFunc = (List<Funcionario>) request.getSession().getAttribute("lista");

			// ESCOLHER JSP
			url = "sucesso.jsp";

			request.getSession().setAttribute("lista", listaFunc);

		} catch (Exception e) {
			System.out.println("Erro ao cadastrar" + e);
			url = "erro.jsp";
		}
		// ENVIAR O REQUEST PARA VIEW RETORNA O RESULTADO FINAL
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
