package com.wantao.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

/*
 *@author:wantao
 *@time:Jul 27, 2018 11:05:12 AM
 *@description:
 * 
 */
public class HelloAction {
	public String execute() {
		System.out.println("execute方法被执行");
		ActionContext context = ActionContext.getContext();
		ValueStack valueStack1 = context.getValueStack();
		ValueStack valueStack2 = context.getValueStack();
		System.out.println(valueStack1 == valueStack2);//结果为true说明每个action中只有一个ValueStack
		return "ok";
	}

	public String add() {
		System.out.println("add方法被执行");
		return "ok";
	}

	public String delete() {
		System.out.println("delete被方法执行");
		return "ok";
	}

	public String update() {
		System.out.println("update方法被执行");
		return "ok";
	}

	public String select() {
		System.out.println("select方法被执行");
		return "ok";
	}

	public String testRedirect() {
		System.out.println("重定向方法被执行");
		return "testRedirect";
	}

}
