package entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
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

	public List<OrderItem> getItems() {
		return items;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void addItems(OrderItem item) {
		items.add(item);
	}
	
	public void removeItems(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrderItem i : items) {
			total += i.subTotal();
		}
		
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("NOTA DO PEDIDO: \n");
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(moment) +"\n");
		sb.append("Status do pedido: ");
		sb.append(status +"\n");
		sb.append("Cliente: ");
		sb.append(client + "\n");
		sb.append("Itens do pedido: \n");
		
		for(OrderItem i : items) {
			sb.append(i.toString());
		}
		
		sb.append("\nTotal do pedido: R$");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}
	
}
