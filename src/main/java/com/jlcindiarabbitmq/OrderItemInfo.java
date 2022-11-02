package com.jlcindiarabbitmq;

import java.io.Serializable;

public class OrderItemInfo implements Serializable {
	private Integer orderItemId;
	private Integer orderId;
	private Integer bookId;
	private int qty;
	private double cost;
	public OrderItemInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrderItemInfo(Integer orderId, Integer bookId, int qty, double cost) {
		super();
		this.orderId = orderId;
		this.bookId = bookId;
		this.qty = qty;
		this.cost = cost;
	}

	public OrderItemInfo(Integer orderItemId, Integer orderId, Integer bookId, int qty, double cost) {
		super();
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.bookId = bookId;
		this.qty = qty;
		this.cost = cost;
	}
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "OrderItemInfo [orderItemId=" + orderItemId + ", orderId=" + orderId + ", bookId=" + bookId + ", qty="
				+ qty + ", cost=" + cost + "]";
	}
	

}
