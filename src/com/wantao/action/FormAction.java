package com.wantao.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wantao.bean.User;

/*
 *@author:wantao
 *@time:Jul 28, 2018 8:50:29 AM
 *@description:
 */
public class FormAction extends ActionSupport implements ModelDriven<User> {
	/*
	 * public String form1() { // 1.通过ActionContext类获取表单数据 ActionContext context =
	 * ActionContext.getContext(); Map<String, Object> map =
	 * context.getParameters(); Set<String> keys = map.keySet(); for (String key :
	 * keys) { Object[] obj = (Object[]) map.get(key);
	 * System.out.println(Arrays.toString(obj)); } System.out.println("表单action执行");
	 * return NONE; }
	 */
	// ２.使用ServletActionContext类来获取表单数据
	/*
	 * public String form1() { HttpServletRequest
	 * request=ServletActionContext.getRequest(); String
	 * username=request.getParameter("username"); String
	 * password=request.getParameter("password"); System.out.println(username);
	 * System.out.println(password); return NONE; }
	 */
	// 定义成员变量与前端的name相同
	/*
	 * private String username; private String password;
	 * 
	 * 
	 * public String getUsername() { return username; }
	 * 
	 * public void setUsername(String username) { this.username = username; }
	 * 
	 * public String getPassword() { return password; }
	 * 
	 * public void setPassword(String password) { this.password = password; } public
	 * String form1() { System.out.println(username); System.out.println(password);
	 * return NONE; }
	 */
	private User user = new User();
	public String form1() {
		System.out.println(user.toString());
		return NONE;
	}

	@Override
	public User getModel() {
		return user;
	}
}
