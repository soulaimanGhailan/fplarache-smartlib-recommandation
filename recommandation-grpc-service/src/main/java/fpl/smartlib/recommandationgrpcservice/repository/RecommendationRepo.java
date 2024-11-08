package fpl.smartlib.recommandationgrpcservice.repository;

import fpl.smartlib.recommandationgrpcservice.entities.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepo extends JpaRepository<Recommendation, Long> {
    Recommendation findRecommendationByUserId(long userId);
}
