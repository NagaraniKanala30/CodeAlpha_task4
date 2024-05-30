package hotelreservation;

import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Check-in Date (YYYY-MM-DD): ");
        String checkInDate = scanner.nextLine();
        System.out.println("Enter Check-out Date (YYYY-MM-DD): ");
        String checkOutDate = scanner.nextLine().trim();
        System.out.println("Enter Number of Rooms: ");
        int numberOfRooms = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Enter Room Type (Single, Double, Suite): ");
        String roomType = scanner.nextLine().trim();
        System.out.println("Enter Number of Adults: ");
        int numberOfAdults = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Enter Number of Children: ");
        int numberOfChildren = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Enter Payment Method: ");
        String paymentMethod = scanner.nextLine().trim();
        System.out.println("Enter Cardholder Name: ");
        String cardholderName = scanner.nextLine().trim();
        System.out.println("Enter Card Number: ");
        String cardNumber = scanner.nextLine().trim();
        System.out.println("Enter Card Expiry (MM/YY): ");
        String cardExpiry = scanner.nextLine().trim();
        System.out.println("Enter Card CVV: ");
        String cardCVV = scanner.nextLine().trim();

        System.out.println("Enter Special Requests: ");
        String specialRequests = scanner.nextLine().trim();
        System.out.println("Enter Room Preferences: ");
        String roomPreferences = scanner.nextLine().trim();

        System.out.println("Enter ID Document Type: ");
        String idDocumentType = scanner.nextLine().trim();
        System.out.println("Enter ID Document Number: ");
        String idDocumentNumber = scanner.nextLine().trim();

        Reservation reservation = new Reservation(checkInDate, checkOutDate, numberOfRooms, roomType, numberOfAdults,
                numberOfChildren, paymentMethod, cardholderName, cardNumber, cardExpiry, cardCVV,
                specialRequests, roomPreferences, idDocumentType, idDocumentNumber);

        while (true) {
            System.out.println("Do you want to add a guest? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("no")) {
                break;
            }

            System.out.println("Enter Guest Name: ");
            String name = scanner.nextLine().trim();
            System.out.println("Enter Guest Age: ");
            int age = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Enter Guest Gender: ");
            String gender = scanner.nextLine().trim();
            System.out.println("Enter Guest Nationality: ");
            String nationality = scanner.nextLine().trim();
            System.out.println("Enter Guest Phone Number: ");
            String phoneNumber = scanner.nextLine().trim();
            System.out.println("Enter Guest Email Address: ");
            String emailAddress = scanner.nextLine().trim();

            Guest guest = new Guest(name, age, gender, nationality, phoneNumber, emailAddress);
            reservation.addGuest(guest);
        }

        System.out.println("Reservation Details:");
        System.out.println(reservation);

        scanner.close();
    }
}
