package cz.uhk.pro2.chat.service;

import cz.uhk.pro2.chat.model.Message;
import cz.uhk.pro2.chat.model.Room;

import java.util.List;

public class FakeChatService implements ChatService {
    @Override
    public boolean login(String username, String password) {
        return (username.equals("pikachu"));
    }

    @Override
    public void sendMessage(Message message, int roomId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<Message> search(String term, int roomId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<Message> getMessages(int roomId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<Room> getAllRooms() {
 throw new UnsupportedOperationException("Not implemented yet");
    }
}
