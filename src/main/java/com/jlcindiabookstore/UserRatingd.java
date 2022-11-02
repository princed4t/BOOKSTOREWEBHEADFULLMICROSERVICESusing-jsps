package com.jlcindiabookstore;

public class UserRatingd {

	private Integer ratingId;

	private Integer bookId;

	private String userId;

	private double rating;

	private String review;

	public UserRatingd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRatingd(Integer bookId, String userId, double rating, String review) {
		super();
		this.bookId = bookId;
		this.userId = userId;
		this.rating = rating;
		this.review = review;
	}

	public UserRatingd(Integer ratingId, Integer bookId, String userId, double rating, String review) {
		super();
		this.ratingId = ratingId;
		this.bookId = bookId;
		this.userId = userId;
		this.rating = rating;
		this.review = review;
	}

	public Integer getRatingId() {
		return ratingId;
	}

	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "UserRatingd [ratingId=" + ratingId + ", bookId=" + bookId + ", userId=" + userId + ", rating=" + rating
				+ ", review=" + review + "]";
	}

}
