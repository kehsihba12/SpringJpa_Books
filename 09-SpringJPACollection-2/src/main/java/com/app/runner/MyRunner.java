package com.app.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.mapping.List;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Product;
import com.app.repo.MyRepositoty;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private MyRepositoty repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product pd = new Product();
		
		pd.setProdId(101);
		pd.setProdName("wipro");
		
	
		Set<String> s = new LinkedHashSet<>();
		s.add("abhi");
		s.add("ammu");
		s.add("basu");
		
		pd.setColurs(s);
		
		pd.setValues(Arrays.asList(1,2,4));
		
		java.util.Map<String, String> map = new LinkedHashMap();
		map.put("d1", "nanu");
		map.put("d2", "abhi");
		
		pd.setNames(map);
		
		repo.save(pd);
		
	}

}
