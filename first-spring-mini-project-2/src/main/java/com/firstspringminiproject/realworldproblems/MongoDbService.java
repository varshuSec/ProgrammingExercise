package com.firstspringminiproject.realworldproblems;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MongoDbService implements DataService {

	@Override
	public List<Integer> retrieval() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		return list;
	}

}
