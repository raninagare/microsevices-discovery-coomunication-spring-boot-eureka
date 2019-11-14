package com.rani.bookcatalogservice.bookcatalogservice.resources;

import com.rani.bookcatalogservice.bookcatalogservice.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bookCatalog")
public class BookCatalogResource {

    // give user id as a input and return all the books the user has read and its ratings
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        return Arrays.asList(new CatalogItem()
                );

    }
}
