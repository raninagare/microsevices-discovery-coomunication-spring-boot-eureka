# microsevices-discovery-coomunication-spring-boot-eureka
*Book Info Service:* bookId/Isbn number ,book deatils
*Ratings Data Service:* user id, list of book ids and ratings

*Book Catalog Service:* UserId, book list with details.
Book catalog service calls Rating data service to check what all books this user has read and for each book it calls Book info service to get book details and put all together all these details.




