package school.sorokin.javacore.exception.custom_exception;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        try {
            hotel.bookRoom(5);
        } catch (RoomNotAvailableException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidRoomNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
