package org.sid.demo_springcloud_kafka.services;

import org.sid.demo_springcloud_kafka.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;


@Service
public class PageEventService {
    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
        return (input)->{
            System.out.println("****");
            System.out.println(input.toString());
            System.out.println("****");

        };

    }
}
