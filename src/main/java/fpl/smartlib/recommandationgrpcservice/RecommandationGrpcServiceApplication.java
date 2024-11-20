package fpl.smartlib.recommandationgrpcservice;

import fpl.smartlib.recommandationgrpcservice.entities.Recommendation;
import fpl.smartlib.recommandationgrpcservice.repository.RecommendationRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RecommandationGrpcServiceApplication {

	private RecommendationRepo recommendationRepo ;

    public RecommandationGrpcServiceApplication(RecommendationRepo recommendationRepo) {
        this.recommendationRepo = recommendationRepo;
    }

    public static void main(String[] args) {
		SpringApplication.run(RecommandationGrpcServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(){
		return args -> {
			recommendationRepo.save(Recommendation.builder()
							.id(1L)
							.createdAT(System.currentTimeMillis())
							.userId(1L)
					.build()) ;
		} ;
	}

}
