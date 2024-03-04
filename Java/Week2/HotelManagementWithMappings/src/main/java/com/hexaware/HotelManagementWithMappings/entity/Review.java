package com.hexaware.HotelManagementWithMappings.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	private Long ReviewID;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Long UserID;
	@ManyToOne
    @JoinColumn(name = "hotel_id")
	private Long HotelID;
	private int Rating;
	private String ReviewText;
	private String ReviewDate;
	
	public Review() {
		
	}

	public Long getReviewID() {
		return ReviewID;
	}

	public void setReviewID(Long reviewID) {
		ReviewID = reviewID;
	}

	public Long getUserID() {
		return UserID;
	}

	public void setUserID(Long userID) {
		UserID = userID;
	}

	public Long getHotelID() {
		return HotelID;
	}

	public void setHotelID(Long hotelID) {
		HotelID = hotelID;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

	public String getReviewText() {
		return ReviewText;
	}

	public void setReviewText(String reviewText) {
		ReviewText = reviewText;
	}

	public String getReviewDate() {
		return ReviewDate;
	}

	public void setReviewDate(String reviewDate) {
		ReviewDate = reviewDate;
	}

}
