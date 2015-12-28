package com.example.helloworld.resources;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.helloworld.DB;
import com.example.helloworld.api.SentencePojo;
import com.example.helloworld.api.WordCategory;

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
	public SentencePojo generate() throws Exception {

		// TODO
		Set<String> words = DB.getInstance().getAllWordKeys();
		Set<String> verbs = new HashSet<String>();
		Set<String> nouns = new HashSet<String>();
		Set<String> adjectives = new HashSet<String>();
		
		Iterator<String> it = words.iterator();
		while (it.hasNext()) {
			String w = it.next();
			

			WordCategory wc = DB.getInstance().getWord(w);
			switch (wc) {
			case NOUN:
				nouns.add(w);
				break;
			case ADJECTIVE:
				adjectives.add(w);
				break;
			case VERB:
				verbs.add(w);
				break;

			}
		}
		
		if (verbs.size() == 0 || nouns.size() == 0 || nouns.size() == 0){
			throw new Exception("Not enough data to generate sentence");
		}
		
		Random r = new Random();
		
		String noun = (String) (nouns.toArray())[r.nextInt(nouns.size())];
		String verb = (String) (verbs.toArray())[r.nextInt(nouns.size())];
		String adjective = (String) (adjectives.toArray())[r.nextInt(nouns.size())];

		SentencePojo s = new SentencePojo();
		s.setNoun(noun);
		s.setVerb(verb);
		s.setAdjective(adjective);
		s.setId(DB.getInstance().getNextSentenceId());
		
		s.setShowDisplayCount(0);		
		s.setText(s.getNoun() + " " + s.getVerb() + " " + s.getAdjective());

		return s;
	}

	@GET
	@Path("/sentences/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public SentencePojo getByID(@PathParam("id") Integer id) {

		System.out.println("id :" + id);
		SentencePojo s = DB.getInstance().getSentence(id);
		s.setShowDisplayCount(s.getShowDisplayCount()+1);

		s.setText(s.getNoun() + " " + s.getVerb() + " " + s.getAdjective());

		return s;
	}

	@GET
	@Path("/sentences/{id}/yoda")
	@Produces(MediaType.APPLICATION_JSON)
	public SentencePojo geyByIdYodaStyle(@PathParam("id") Integer id) {
		System.out.println("id :" + id);
		SentencePojo s = DB.getInstance().getSentence(id);
		s.setShowDisplayCount(s.getShowDisplayCount()+1);

		s.setText(s.getAdjective() + " " + s.getNoun() + " " + s.getVerb());

		return s;
	}

}
