package cz.uhk.pro2.chat.model;

import java.time.LocalDateTime;

public class Message {
    private String from, msg, to;
    private LocalDateTime dateTime;

    public String getFrom() {
        return from;
    }

    // constructor
    public Message(String from, String msg, String to, LocalDateTime localDateTime) {
        this.from = from;
        this.msg = msg;
        this.to = to;
        this.dateTime = localDateTime;}

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
