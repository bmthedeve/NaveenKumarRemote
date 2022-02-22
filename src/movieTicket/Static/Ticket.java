
package movieTicket.Static;

public class Ticket {
	private int ticketId;
	private int price;
	public static int availableTickets;
	
	public Ticket(int ticketId, int price) {
		super();
		this.ticketId = ticketId;
		this.price = price;
	}
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}
	
	public int calculateTicketCost(int nooftickets) {
		if(this.availableTickets >= nooftickets) {
			int totalAmount = nooftickets * this.price;
			this.availableTickets = this.availableTickets - nooftickets;
			return totalAmount;
		}
		else {
			return -1;
		}
	} 
	
	
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", price=" + price + "]";
	}
	
}