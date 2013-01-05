package cn.edu.nju.software.serviceConfig;

import cn.edu.nju.software.service.IContactService;
import cn.edu.nju.software.service.ILoginService;
import cn.edu.nju.software.serviceImpl.ContactServiceImpl;
import cn.edu.nju.software.serviceImpl.LoginServiceImpl;

public class ClientServiceHelper {
	private static IContactService contactService;
	
	private static ILoginService loginService;
	
	public static IContactService getContactService() {
		if(contactService == null)
			contactService = new ContactServiceImpl();
		return contactService;
	}
	
	public static ILoginService getLoginService() {
		if(loginService == null)
			loginService = new LoginServiceImpl();
		return loginService;
	}
	
}