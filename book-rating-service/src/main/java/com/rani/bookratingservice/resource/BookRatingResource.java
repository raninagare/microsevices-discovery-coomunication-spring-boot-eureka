package com.rani.bookratingservice.resource;

import com.rani.bookratingservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class BookRatingResource {

    @RequestMapping("/{userId}")
    public List<Rating> getBookRatings(@PathVariable("userId") String userId){
        return Arrays.asList(new Rating("b1",userId,4  ),
                new Rating("b2",userId,5  )

        );

    }
}
