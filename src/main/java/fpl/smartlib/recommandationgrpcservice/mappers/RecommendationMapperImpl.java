package fpl.smartlib.recommandationgrpcservice.mappers;

import fpl.smartlib.recommandationgrpcservice.entities.Recommendation;
import fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation;
import fpl.smartlib.recommandationgrpcservice.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
@Transactional
public class RecommendationMapperImpl implements RecommendationMapper {
    @Override
    public Recommendation fromGrpcRecommendation(Recommandation.Recommendation grpcRecommendation) {
        Recommendation recommendation = Recommendation.builder()
                .id(grpcRecommendation.getId())
                .userId(grpcRecommendation.getUserId())
                .createdAT(grpcRecommendation.getCreatedAT())
                .books(grpcRecommendation.getBooksList().stream()
                        .map(protoBook -> Book.builder()
                                .bookId(protoBook.getBookId())
                                .title(protoBook.getTitle())
                                .author(protoBook.getAuthor())
                                .publisher(protoBook.getPublisher())
                                .isbn(protoBook.getIsbn())
                                .build())
                        .collect(Collectors.toList()))
                .build();
        return recommendation;
    }

    @Override
    public Recommandation.Recommendation fromRecommendation(Recommendation recommendation) {
        Recommandation.Recommendation grpcRecommendation =  Recommandation.Recommendation.newBuilder()
                .setId(recommendation.getId())
                .setUserId(recommendation.getUserId())
                .setCreatedAT(recommendation.getCreatedAT())
                .addAllBooks(
                        recommendation.getBooks().stream()
                                .map(book -> Recommandation.Book.newBuilder()
                                        .setBookId(book.getBookId())
                                        .setTitle(book.getTitle())
                                        .setAuthor(book.getAuthor())
                                        .setPublisher(book.getPublisher())
                                        .setIsbn(book.getIsbn())
                                        .build())
                                .collect(Collectors.toList()) )
                .build() ;
        return grpcRecommendation;
    }
}
