package org.sid.demo_springcloud_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSpringcloudKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringcloudKafkaApplication.class, args);
	}

}
