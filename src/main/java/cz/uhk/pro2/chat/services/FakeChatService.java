package cz.uhk.pro2.chat.services;

import com.github.javafaker.Faker;
import cz.uhk.pro2.chat.model.Message;
import cz.uhk.pro2.chat.model.Room;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FakeChatService implements ChatService {
    private List<Message> messages = new ArrayList<>();
    private final Faker faker = new Faker();

    public FakeChatService() {
        createNewFakeMessage();
        createNewFakeMessage();
        createNewFakeMessage();
    }

    private void createNewFakeMessage() {
        Message m = new Message(
                faker.name().firstName(),
                "",
                faker.yoda().quote(),
                LocalDateTime.ofInstant(
                        faker.date().past(10,
                                TimeUnit.MINUTES).toInstant(),
                        ZoneId.systemDefault()
                )
        );
        messages.add(m);
    }

    @Override
    public boolean login(String username, String password) {
        return (username.equals("pikachu"));
    }

    @Override
    public void sendMessage(Message message, int roomId) {
        messages.add(message);
    }

    @Override
    public List<Message> search(String term, int roomId) {
         throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<Message> getMyMessages(int roomId) {
        // TODO optional filter only messages to me
        return Collections.unmodifiableList(messages);
    }

    @Override
    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, "PRO1"));
        rooms.add(new Room(2, "PRO2"));
        rooms.add(new Room(3, "PRO3"));
        // To prevent change of the list - we return unmodifiable list
        return Collections.unmodifiableList(rooms);
    }
}
