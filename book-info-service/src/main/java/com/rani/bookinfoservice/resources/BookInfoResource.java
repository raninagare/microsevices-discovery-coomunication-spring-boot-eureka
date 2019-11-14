package com.rani.bookinfoservice.resources;

import com.rani.bookinfoservice.model.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookInfoResource {


    @RequestMapping("/{bookId}")
    public Book getBookDetails(@PathVariable("bookId") String bookId){
        return new Book( bookId, "Java Complete Reference" ,"Herbert Schildt");

    }
}
