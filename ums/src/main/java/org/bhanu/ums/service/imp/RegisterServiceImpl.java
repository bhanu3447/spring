package org.bhanu.ums.service.imp;

import java.util.List;

import org.bhanu.ums.entity.RegisterEntity;
import org.bhanu.ums.repository.RegisterRepository;
import org.bhanu.ums.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService
{
	
	@Autowired
	private RegisterRepository registerRepository;

	@Override
	public void processUserInfo(RegisterEntity registerEntity) 
	{	
		registerRepository.saveUser(registerEntity);
	}

	@Override
	public List<RegisterEntity> getAllUser() 
	{
		return registerRepository.findAllUsers();
	}

	
}
