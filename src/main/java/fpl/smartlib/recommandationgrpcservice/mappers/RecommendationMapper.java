package fpl.smartlib.recommandationgrpcservice.mappers;

import fpl.smartlib.recommandationgrpcservice.entities.Recommendation;
import fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation;

public interface RecommendationMapper {
    Recommendation fromGrpcRecommendation(Recommandation.Recommendation recommendation);
    Recommandation.Recommendation fromRecommendation(Recommendation recommendation);
}
