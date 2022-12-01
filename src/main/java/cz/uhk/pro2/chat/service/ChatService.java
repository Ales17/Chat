package cz.uhk.pro2.chat.service;

import cz.uhk.pro2.chat.model.Message;
import cz.uhk.pro2.chat.model.Room;

import java.util.List;

public interface ChatService {
    /**
     * Try to log user in.
     * @param username
     * @param password
     * @return true if login was successful, false otherwise
     */

    // HW - dodelat dokumentacni komentare
    boolean login(String username, String password);
    /**
     * Send message to the room
     * @param message
     * @param roomId
     */
    void sendMessage(Message message, int roomId);
    /**
     * Search for messages in the room
     * @param term
     * @param roomId
     * @return
     */
    List<Message> search(String term, int roomId);
    /**
     * Get all messages in the room
     * @param roomId
     * @return
     */
    List<Message> getMessages(int roomId);
    /**
     * Get all rooms
     * @return
     */
    List<Room>getAllRooms();
    
}
