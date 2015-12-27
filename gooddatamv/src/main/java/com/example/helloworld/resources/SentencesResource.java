package com.example.helloworld.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.helloworld.api.SentencePojo;

@Path("/demo")
public class SentencesResource {

	
	@GET
	@Path("/sentences")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SentencePojo> getList() {
		List<SentencePojo> list = new ArrayList<>();

		return list;
	}
	
	@POST
	@Path("/sentences/generate")
	@Produces(MediaType.APPLICATION_JSON)
	public SentencePojo generate() {
		SentencePojo s = new SentencePojo();
		

		return s;
	}
	
	
	
}
