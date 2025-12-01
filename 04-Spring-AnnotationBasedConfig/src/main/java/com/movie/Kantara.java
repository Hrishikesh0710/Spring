package com.movie;

import org.springframework.stereotype.Component;

@Component
public class Kantara implements Movie{

	public void story() {
		System.out.println("A divine story of Deva and Guna");
	}

}
