package hotelreservation;


import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private String checkInDate;
    private String checkOutDate;
    private int numberOfRooms;
    private String roomType;
    private int numberOfAdults;
    private int numberOfChildren;
    private List<Guest> guests;
    private String paymentMethod;
    private String cardholderName;
    private String cardNumber;
    private String cardExpiry;
    private String cardCVV;
    private String specialRequests;
    private String roomPreferences;
    private String idDocumentType;
    private String idDocumentNumber;

    public Reservation(String checkInDate, String checkOutDate, int numberOfRooms, String roomType, int numberOfAdults,
                       int numberOfChildren, String paymentMethod, String cardholderName, String cardNumber,
                       String cardExpiry, String cardCVV, String specialRequests, String roomPreferences,
                       String idDocumentType, String idDocumentNumber) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfRooms = numberOfRooms;
        this.roomType = roomType;
        this.numberOfAdults = numberOfAdults;
        this.numberOfChildren = numberOfChildren;
        this.guests = new ArrayList<>();
        this.paymentMethod = paymentMethod;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.cardExpiry = cardExpiry;
        this.cardCVV = cardCVV;
        this.specialRequests = specialRequests;
        this.roomPreferences = roomPreferences;
        this.idDocumentType = idDocumentType;
        this.idDocumentNumber = idDocumentNumber;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public String toString() {
        return "Reservation [CheckInDate=" + checkInDate + ", CheckOutDate=" + checkOutDate + ", NumberOfRooms=" + numberOfRooms
                + ", RoomType=" + roomType + ", NumberOfAdults=" + numberOfAdults + ", NumberOfChildren=" + numberOfChildren
                + ", Guests=" + guests + ", PaymentMethod=" + paymentMethod + ", CardholderName=" + cardholderName
                + ", CardNumber=" + cardNumber + ", CardExpiry=" + cardExpiry + ", CardCVV=" + cardCVV
                + ", SpecialRequests=" + specialRequests + ", RoomPreferences=" + roomPreferences
                + ", IDDocumentType=" + idDocumentType + ", IDDocumentNumber=" + idDocumentNumber + "]";
    }
}
