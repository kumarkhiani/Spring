package com.kumar.rest;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeetingController {

	private final String template = "Hello %s!";
	private final AtomicInteger counter = new AtomicInteger(1);
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public Greeting getGreeting(@RequestParam(value="name", defaultValue="World") final String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
}
