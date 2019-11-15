package com.rani.bookcatalogservice.resources;

import com.rani.bookcatalogservice.model.Book;
import com.rani.bookcatalogservice.model.CatalogItem;
import com.rani.bookcatalogservice.model.Rating;
import com.rani.bookcatalogservice.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bookCatalog")
public class BookCatalogResource {

    @Autowired
    RestTemplate restTemplate;

    // give user id as a input and return all the books the user has read and its ratings
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        List<CatalogItem> catalogItemList=new ArrayList<CatalogItem>(  );
        //get all the movies rated by user
        UserRating userRating =restTemplate.getForObject( "http://localhost:8082/ratingsdata/"+userId , UserRating.class );

        //for every id call bookinfo service get info for every book
        List<Rating> ratings=userRating.getUserRating();
        for(Rating rating:ratings){
            //It calls the given Service(URL) and returns Book object
           Book book= restTemplate.getForObject("http://localhost:8084/books/"+rating.getBookId(),Book.class );
           CatalogItem catalogItem=new CatalogItem(book.getBookName(),book.getAuthor(),rating.getRating() );
           catalogItemList.add( catalogItem );
        }

        return catalogItemList;

    }
}
