package entites;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus stutus;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStutus() {
		return stutus;
	}
	public void setStutus(OrderStatus stutus) {
		this.stutus = stutus;
	}
	public Order(Integer id, Date moment, OrderStatus stutus) {
		super();
		this.id = id;
		this.moment = moment;
		this.stutus = stutus;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", stutus=" + stutus + "]";
	}
	
	
	
}
