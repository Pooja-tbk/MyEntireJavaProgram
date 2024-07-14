package assignment;

public class ElseIfPrgmToPrintTicketCost {

	public static void main(String[] args) {
		char gendr1 = 'M';
		char gender2 = 'F';
		char gender3 = 'C';
		int ticket_cost = 200;

		if (gendr1 == 'M') {
			if (ticket_cost >= 200) {
				System.out.println("This ticket is cost eligible for male");
			} else {
				System.out.println("This ticket is cost not eligible for male");
			}
		} else {
			System.out.println("This ticket cost not for male");
		}

		if (gender2 == 't') {
			if (ticket_cost == 200) {
				System.out.println("This ticket cost is eligible for female");
			} else {
				System.out.println("This ticket cost not eligible for female");
			}
		} else {
			System.out.println("This ticket cost not for female");
		}

		if (gender3 == 'C') {
			if (ticket_cost < 200) {
				System.out.println("This ticket is cost eligible for custom");
			} else {
				System.out.println("This ticket is cost not eligible for custom");
			}
		} else {
			System.out.println("This ticket cost not for custom");
		}

	}
}
