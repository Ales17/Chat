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
    void sendMessage(Message message, int roomId);
    List<Message> search(String term, int roomId);
    List<Message> getMessages(int roomId);
    List<Room>getAllRooms();
    
}
