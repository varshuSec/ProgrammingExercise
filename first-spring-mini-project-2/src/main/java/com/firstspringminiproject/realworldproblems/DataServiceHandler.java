package com.firstspringminiproject.realworldproblems;

import org.springframework.stereotype.Component;

@Component
public class DataServiceHandler {
	DataService dataService;
	
	public DataServiceHandler(DataService dataService) {
		this.dataService = dataService;
	}
}
