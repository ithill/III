package iii.servletjsp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowPicture")

public class ShowPictureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] sa = {"fs.jpg","m12.jpg","Monterey_Butterflies.jpg"};
		int idx =(int) (Math.random()*sa.length);
		String filename = sa[idx];
		String pathname = "/images/"+filename;
		ServletContext context = getServletContext();
		String mimeType = context.getMimeType(filename);
		response.setContentType(mimeType);
		try(
			InputStream is =context.getResourceAsStream(pathname); //getResourceAsStream()=FileOutputStream()--open somefile
			OutputStream os = response.getOutputStream();
			){
				int len = 0;
				byte[] b = new byte[8192];
				while((len = is.read(b)) !=-1){ //maybe "is" cannot catch any file,"is" become "null"--nullpoiter
					os.write(b, 0, len);
				}
		}
	}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//	}

}
