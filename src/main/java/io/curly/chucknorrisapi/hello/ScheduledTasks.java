package io.curly.chucknorrisapi.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledTasks
{
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(fixedRate = 1000)
    public void getNewJoke()
    {
        RestTemplate restTemplate = new RestTemplate();

        Joke joke = restTemplate.getForObject("http://api.icndb.com/jokes/random", Joke.class);
        log.info(joke.toString());
    }
}
