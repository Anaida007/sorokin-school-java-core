package school.sorokin.javacore.exception.custom_exception;

public class Hotel {

    public void bookRoom(int roomId) {
        if (isBookAvailable(roomId)) {
            System.out.println("Номер успешно забронирован!");
        } else {
            throw new RoomNotAvailableException("Номер " + roomId + " недоступен");
        }
    }

    private boolean isBookAvailable(int roomId) {
        if (roomId < 1 || roomId > 1000) {
            throw new InvalidRoomNumberException("Некорректный номер аппартаментов: " + roomId);
        }
        return true;
    }
}
