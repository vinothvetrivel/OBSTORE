/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import Model.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author vinoth
 */
public class LoginAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";
    

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginForm formBean=(LoginForm)form;
        UserService ser = new UserService();
        
        String name = formBean.getUser();
        String pass = formBean.getPass();
        
        if ((name == null) ||  pass == null ||  name.equals("") ||  pass.equals("")) {  
            if(ser.Validate(formBean)==false){
                formBean.setError();
                return mapping.findForward(FAILURE);
            }
            
        }

        return mapping.findForward(SUCCESS);
            
    }
}
        
         
