package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Function extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
	        HttpServletResponse response) throws ServletException, IOException {
			String code;
			String filename = "/home/test/Documents/newcode.js";
	        response.setContentType("text/javascript");
	     	BufferedReader br = null;
			FileReader fr = null;

			try {

				fr = new FileReader(filename);
				br = new BufferedReader(fr);
				br = new BufferedReader(new FileReader(filename));

				while ((code = br.readLine()) != null) {
					//PrintWriter out = response.getWriter();
			        //out.print(code);
			        //out.flush();
			        response.getWriter().write(code);
				}
				

			} catch (IOException e) {

				e.printStackTrace();

			}
	        
	      }
	}

