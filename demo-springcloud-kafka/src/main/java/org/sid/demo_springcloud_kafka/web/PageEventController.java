package org.sid.demo_springcloud_kafka.web;

import org.sid.demo_springcloud_kafka.entities.PageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class PageEventController {

    @Autowired
    private StreamBridge streamBridge;

    private Random random = new Random();


    @Scheduled(fixedRate = 100000)
    public void publishResearchEvent() {
        String[] keywords = {"Science", "Technology", "Art", "History", "Mathematics"};
        String randomKeyword = keywords[random.nextInt(keywords.length)];

        PageEvent pageEvent = new PageEvent();
        pageEvent.setName(randomKeyword);
        pageEvent.setUser("U" + random.nextInt(2));
        pageEvent.setDate(new Date());
        pageEvent.setDuration(random.nextInt(9000));
        pageEvent.setEventType("onResearch");


        streamBridge.send("R1", pageEvent);
        System.out.println("Sent onResearch event: " + pageEvent);
    }


    @Scheduled(fixedRate = 100000)
    public void publishRateEvent() {
        String[] bookNames = {"Java Programming", "Spring Boot Guide", "Learning Kubernetes", "Spring Cloud"};
        String randomBook = bookNames[random.nextInt(bookNames.length)];
        int randomRating = random.nextInt(5) + 1;

        PageEvent pageEvent = new PageEvent();
        pageEvent.setName(randomBook + " - Rating: " + randomRating);
        pageEvent.setUser("U" + random.nextInt(2));
        pageEvent.setDate(new Date());  // Current timestamp
        pageEvent.setDuration(random.nextInt(9000));
        pageEvent.setEventType("onRate");


        streamBridge.send("R1", pageEvent);
        System.out.println("Sent onRate event: " + pageEvent);
    }


    @Scheduled(fixedRate = 10000)
    public void publishPurchaseEvent() {

        String[] bookNames = {"Java Programming", "Spring Boot Guide", "Learning Kubernetes", "Spring Cloud"};
        String[] genres = {"Programming", "Tech", "Cloud", "Networking"};
        String[] authors = {"John Doe", "Jane Smith", "Alex Johnson", "Emma Williams"};

        String randomBook = bookNames[random.nextInt(bookNames.length)];
        String randomGenre = genres[random.nextInt(genres.length)];
        String randomAuthor = authors[random.nextInt(authors.length)];

        PageEvent pageEvent = new PageEvent();
        pageEvent.setName(randomBook + " - Genre: " + randomGenre + " - Author: " + randomAuthor);
        pageEvent.setUser("U" + random.nextInt(2));
        pageEvent.setDate(new Date());
        pageEvent.setDuration(random.nextInt(9000));
        pageEvent.setEventType("onPurchase");


        streamBridge.send("R1", pageEvent);
        System.out.println("Sent onPurchase event: " + pageEvent);
    }
}
