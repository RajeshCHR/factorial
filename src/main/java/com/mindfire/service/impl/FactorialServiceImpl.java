package com.mindfire.service.impl;

import org.springframework.stereotype.Service;

import com.mindfire.service.FactorialService;

@Service
public class FactorialServiceImpl implements FactorialService{
	
	public Integer getFactorialValue(int number)
	{
		int i,fact=1;
		for(i=1;i<=number;i++){
		fact=fact*i;
		}
		return fact;
	}
      
}
