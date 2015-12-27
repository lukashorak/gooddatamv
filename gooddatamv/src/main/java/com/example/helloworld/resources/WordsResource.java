package com.example.helloworld.resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.helloworld.DB;
import com.example.helloworld.api.GetWordRequest;
import com.example.helloworld.api.Word;
import com.example.helloworld.api.WordCategory;
import com.example.helloworld.api.WordPojo;

@Path("/demo")
public class WordsResource {

	@GET
	@Path("/words")
	@Produces(MediaType.APPLICATION_JSON)
	public List<WordPojo> getList() {
		List<WordPojo> list = new ArrayList<>();
		Map<String, WordCategory> map = DB.getInstance().getAllWords();
		Iterator<Entry<String, WordCategory>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, WordCategory> e = it.next();
			WordPojo wp = new WordPojo();
			wp.setWord(e.getKey());
			wp.setWordCategory(e.getValue());
			list.add(wp);
		}

		return list;
	}

	@GET
	@Path("/words/{word}")
	@Produces(MediaType.APPLICATION_JSON)
	public WordPojo getList(@PathParam("word") String word) {

		WordCategory wc = DB.getInstance().getWord(word);

		WordPojo wp = new WordPojo();
		wp.setWord(word);
		wp.setWordCategory(wc);

		return wp;
	}

	@PUT
	@Path("/words")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getList(WordPojo req) {

		System.out.print(req.getWord());
		System.out.print(" ---> ");
		System.out.println(req.getWordCategory());
		
		DB.getInstance().addWord(req.getWord(), req.getWordCategory());
		
		return Response.ok().build();
	}

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public GetWordRequest say() {
		GetWordRequest n = new GetWordRequest();
		Word w = new Word();
		w.setWordCategory(WordCategory.NOUN);
		n.setWord(w);
		return n;
	}
}
