package com.mine.my_first.examples.a1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{
	public int[] retrieveData() {
		return new int[] {1, 2, 3, 4, 5 };
	}
}
