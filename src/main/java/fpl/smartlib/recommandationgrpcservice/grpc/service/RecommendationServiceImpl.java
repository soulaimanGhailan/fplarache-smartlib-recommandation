package fpl.smartlib.recommandationgrpcservice.grpc.service;

import fpl.smartlib.recommandationgrpcservice.entities.Recommendation;
import fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation;
import fpl.smartlib.recommandationgrpcservice.grpc.stub.RecommendationServiceGrpc;
import fpl.smartlib.recommandationgrpcservice.mappers.RecommendationMapper;
import fpl.smartlib.recommandationgrpcservice.model.Book;
import fpl.smartlib.recommandationgrpcservice.repository.RecommendationRepo;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GrpcService
public class RecommendationServiceImpl extends RecommendationServiceGrpc.RecommendationServiceImplBase {

    @Autowired
    private RecommendationRepo recommendationRepo ;

    @Autowired
    private RecommendationMapper recommendationMapper ;

    @Override
    public void getRecommendationsForUser(Recommandation.GetRecommendationsRequest request, StreamObserver<Recommandation.GetRecommendationsResponse> responseObserver) {
        long userId = request.getUserId();
        Recommendation recommendation = recommendationRepo.findById(userId).orElse(null);
        if (recommendation == null) { throw new RuntimeException("Recommendation not found"); }



        /**   REAL TIME INJECTION of BOOK LIST THAT A USER MIGHT BE INTRESTED IN   **/
        recommendation.setBooks(List.of(
                Book.builder().bookId(1l).isbn("111111").title("spring in action").author("josh bosh").publisher("xxxxxxxxxx").build() ,
                Book.builder().bookId(1l).isbn("111111").title("spring in action").author("josh bosh").publisher("xxxxxxxxxx").build() ,
                Book.builder().bookId(1l).isbn("111111").title("spring in action").author("josh bosh").publisher("xxxxxxxxxx").build()
                ));
        /**      logic end of choosing the book list     **/


        Recommandation.GetRecommendationsResponse response = Recommandation.GetRecommendationsResponse.newBuilder()
                .setRecommendation(recommendationMapper.fromRecommendation(recommendation))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createOrUpdateRecommendation(Recommandation.CreateOrUpdateRecommendationRequest request, StreamObserver<Recommandation.CreateOrUpdateRecommendationResponse> responseObserver) {
        super.createOrUpdateRecommendation(request, responseObserver);
    }
}
