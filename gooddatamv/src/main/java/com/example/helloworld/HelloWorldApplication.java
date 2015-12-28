package com.example.helloworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.example.helloworld.api.WordCategory;
import com.example.helloworld.health.TemplateHealthCheck;
import com.example.helloworld.resources.HelloWorldResource;
import com.example.helloworld.resources.SentencesResource;
import com.example.helloworld.resources.WordsResource;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
	public static void main(String[] args) throws Exception {
		new HelloWorldApplication().run(args);
	}

	@Override
	public String getName() {
		return "hello-world";
	}

	@Override
	public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
		// nothing to do yet
		DB.getInstance().addWord("TEST", WordCategory.NOUN);
	}

	@Override
	public void run(HelloWorldConfiguration configuration,
			Environment environment) {
		final HelloWorldResource resource = new HelloWorldResource(
				configuration.getTemplate(), configuration.getDefaultName());
		final WordsResource wordsResource = new WordsResource();
		final SentencesResource sentencesResource = new SentencesResource();
		
		final TemplateHealthCheck healthCheck = new TemplateHealthCheck(
				configuration.getTemplate());
		environment.healthChecks().register("template", healthCheck);
		environment.jersey().register(resource);
		environment.jersey().register(wordsResource);
		environment.jersey().register(sentencesResource);
	}

}