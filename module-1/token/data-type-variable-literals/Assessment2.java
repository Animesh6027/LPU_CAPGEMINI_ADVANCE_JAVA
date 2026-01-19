import java.util.*;
class Assessment2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Passenger ID: ");
		int pass_id=sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Passenger Name: ");
		String pass_name = sc.nextLine();

		System.out.println("Enter Age: ");
		int age = sc.nextInt();

		System.out.println("Enter Base Fare: ");
		double base_fare = sc.nextDouble();

		System.out.println("Is Government Emp(true/false): ");
		boolean govt_emp = sc.nextBoolean();

		if(age<5){
			System.out.println("Free Ticket - No booking required");
			return;
		}
		if(age>80){
			System.out.println("Medical Clearence required");
			return;
		}

		double mul = 0.0;
		String vehicle_type = "";
		System.out.print("Choose mode of Travel(Bus/Train/Flight): ");
		String mode = sc.next();
		switch (mode) {
			case "Bus":
				System.out.print("Choose Bus type(1-Sleeper / 2-Seater): ");
				int type_bus = sc.nextInt();
				switch (type_bus) {
					case 1:
						vehicle_type = "Sleeper Bus";
						mul = 1.2;
						break;
					case 2:
						vehicle_type = "Seater Bus";
						mul = 1.0;
						break;
				}
				break;
			case "Train":
				System.out.println("Choose Train Type(1-General / 2-Sleeper / 3-AC): ");
				int type_train = sc.nextInt();
				switch (type_train) {
					case 1:
						vehicle_type = "General Train";
						mul = 1.0;
						break;
					case 2:
						vehicle_type = "Sleeper Train";
						mul = 1.3;
						break;
					case 3:
						vehicle_type = "AC Train";
						mul = 1.6;
						break;
				}
				break;
			case "Flight":
				System.out.println("Choose Flight type(1-Economy / 2-Business): ");
				int type_flight = sc.nextInt();
				switch (type_flight) {
					case 1:
						vehicle_type = "Economy Class";
						mul = 2.5;
						break;
					case 2:
						vehicle_type = "Business Class";
						mul = 3.5;
						break;
				}
				break;
		}

		double fareAfterClass = base_fare * mul;
		String discount;
		double disc_amt = 0.0;
		if(age>=60){
			discount = "30%";
			disc_amt = fareAfterClass * (30/100);
		}else if(govt_emp == true){
			discount = "15%";
			disc_amt = fareAfterClass * (15/100);
		}else if(age>5 && age<12){
			discount = "50%";
			disc_amt = fareAfterClass * (50/100);
		}else {
			discount = "No Discount";
			disc_amt = fareAfterClass;
		}

		double final_fare = fareAfterClass - disc_amt;
		System.out.println(final_fare);

		String status=""; 
		if(final_fare>=10000){
			if(mode.equals("Flight")){
				status = "Confirmed";
				System.out.println("Booking Status : " + status);
			}else{
				status = "Waiting List";
				System.out.println("Booking Status : " + status);
			}
		}else {
			status = "Confirmed";
			System.out.println("Booking Status : " + status);
		}

		System.out.println("");
		System.out.println("Passenger ID: "+ pass_id);
		System.out.println("Passenger Name: "+ pass_name);
		System.out.println("Travel Type: "+ mode);
		System.out.println("Vehical Type "+ vehicle_type);
		System.out.println("Base fare: "+ base_fare);
		System.out.println("Final Fare: "+ final_fare);
		System.out.println("Discount Applied: "+ discount );
		System.out.println("Booking Status: "+ status);

	}
}