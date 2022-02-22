package movieTicket.Static;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter movie name");
		String movie = sc.next();
		System.out.println("Enter no of bookings");
		int bookings = sc.nextInt();
		System.out.println("Enter the available tickets");
		int availableTickets = sc.nextInt();
		for (int i = 1; i <= bookings; i++) {
			
			System.out.println("Enter the ticketid");
			int ticketId = sc.nextInt();
			System.out.println("Enter the price");
			int price = sc.nextInt();
			System.out.println("Enter the no of tickets");
			int nooftickets = sc.nextInt();
			Ticket ticket = new Ticket(ticketId, price);
			ticket.availableTickets = availableTickets;
			
			System.out.println("Available tickets: "+ticket.getAvailableTickets());
			System.out.println("Total amount: "+ticket.calculateTicketCost(nooftickets));
			System.out.println("Available ticket after booking: "+ticket.getAvailableTickets());
			
		}
		
	}

}
