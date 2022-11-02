package com.jlcindiabookstore;

import java.util.*;

public interface BookStoreService {
public List<String> getAuthorsList();
public List<String> getCategoryList();
public List<Book> getMyBooks(String author, String category);
public Book getBookByBookId(Integer bookId);
public BookInfo getBookInfoByBookId(Integer bookId);
public void placeOrder( Map<Integer,Book> mycartMap);
public List<Order> getMyOrders(String userId);
public void addUserRating(UserRatingd userRating);
public List<UserRatingd> getMyRatings(String userId);
}
