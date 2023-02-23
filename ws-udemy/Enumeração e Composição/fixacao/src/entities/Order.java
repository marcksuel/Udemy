package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private Client cliente;
	
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Order() {}

	public Order(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public Double total() {
		Double total = 0.0;
		
		for(OrderItem item : items) {
			total += item.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " );
		sb.append(sdf.format(moment)+"\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: " + cliente +"\n");
		sb.append("Order items:\n");
		
		for(OrderItem item : items) {
			sb.append(item + "\n");
		}
		
		sb.append("Total price: $"+ String.format("%.2f", total()));
		
		return sb.toString();
	}
	
}
