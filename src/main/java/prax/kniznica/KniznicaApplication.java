package prax.kniznica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import prax.kniznica.rating.Rating;
import prax.kniznica.rating.RatingRepository;

@SpringBootApplication
public class KniznicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KniznicaApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(RatingRepository ratingRepository) {
        return args -> {
            ratingRepository.save(new Rating(null, 1L, 1L, 8));
            ratingRepository.save(new Rating(null, 1L, 2L, 6));
            ratingRepository.save(new Rating(null, 2L, 1L, 9));
        };
    }
}