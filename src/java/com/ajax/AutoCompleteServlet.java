package com.ajax;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author alkathirikhalid www.alkathirikhalid.com
 */
public class AutoCompleteServlet extends HttpServlet {

    private ServletContext context;
    private CertificateData compData = new CertificateData();
    private HashMap certificates = compData.getCertificates();

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.context = config.getServletContext();
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String action = request.getParameter("action");
        String targetId = request.getParameter("id");
        StringBuffer sb = new StringBuffer();

        if (targetId != null) {
            targetId = targetId.trim().toLowerCase();
        } else {
            context.getRequestDispatcher("/error.jsp").forward(request, response);
        }

        boolean namesAdded = false;
        if (action.equals("complete")) {

            // check if user sent empty string
            if (!targetId.equals("")) {

                Iterator it = certificates.keySet().iterator();

                while (it.hasNext()) {
                    String id = (String) it.next();
                    Certificate certificate = (Certificate) certificates.get(id);

                    if ( // targetId matches first name
                            certificate.getFirstName().toLowerCase().startsWith(targetId)
                            || // targetId matches last name
                            certificate.getLastName().toLowerCase().startsWith(targetId)
                            || // targetId matches full name
                            certificate.getFirstName().toLowerCase().concat(" ")
                            .concat(certificate.getLastName().toLowerCase()).startsWith(targetId)) {

                        sb.append("<certificate>");
                        sb.append("<id>" + certificate.getId() + "</id>");
                        sb.append("<firstName>" + certificate.getFirstName() + "</firstName>");
                        sb.append("<lastName>" + certificate.getLastName() + "</lastName>");
                        sb.append("</certificate>");
                        namesAdded = true;
                    }
                }
            }

            if (namesAdded) {
                response.setContentType("text/xml");
                response.setHeader("Cache-Control", "no-cache");
                response.getWriter().write("<certificates>" + sb.toString() + "</certificates>");
            } else {
                //nothing to show
                response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            }
        }

        if (action.equals("lookup")) {
            // Cert Range
            if (Integer.valueOf(targetId) < 100091 || Integer.valueOf(targetId) > 100102){
            context.getRequestDispatcher("/error.jsp").forward(request, response);
            }

            // put the target certificate in the request scope to display 
            if ((targetId != null) && certificates.containsKey(targetId.trim())) {
                request.setAttribute("certificate", certificates.get(targetId));
                context.getRequestDispatcher("/certificate.jsp").forward(request, response);
            }
        }
    }
}
