package com.code.myApp.utility;

import org.modelmapper.ModelMapper;

public class MapperUtil<S,D> {
	
	public D transfer(S s, Class<D> clas) {
		return new ModelMapper().map(s,clas);
	}	

}
