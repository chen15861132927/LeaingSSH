package com.test;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class TestAction extends DispatchAction
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ActionErrors errors=new ActionErrors();
		ActionForward forward=new ActionForward();
		TestForm testForm=(TestForm)form;
		try
		{
			String str1=testForm.getStr1();
			String str2=testForm.getStr2();
			request.setAttribute("str1", str1);
			request.setAttribute("str2", str2);
		} catch (Exception e)
		{
		}
		if(!errors.isEmpty())
		{
			saveErrors(request, errors);
			forward=mapping.findForward("failures");
		}
		else
		{
			forward=mapping.findForward("success");
		}
		return forward;
	}
	
}
