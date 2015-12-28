package gooddatamv;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.example.helloworld.api.WordCategory;
import com.example.helloworld.api.WordPojo;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WordTest {

	@Test
	public void testTest(){
		System.out.println("Test");
	}
	
	@Test
	public void testWord() throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		WordPojo wp = new WordPojo();
		wp.setWord("ABC");
		wp.setWordCategory(WordCategory.NOUN);
		StringBuffer sb = new StringBuffer();
		String result = mapper.writeValueAsString(wp);
		mapper.writeValue(System.out, wp);
		
		assertEquals("{\"word\":\"ABC\",\"wordCategory\":\"NOUN\"}",result);
	}
}
