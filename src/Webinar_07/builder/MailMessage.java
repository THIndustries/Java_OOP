package Webinar_07.builder;

public class MailMessage {
    private String from;
    private String to;
    private String subject;
    private String body;
    private int param1;
    private double praram2;

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public void setPraram2(double praram2) {
        this.praram2 = praram2;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public int getParam1() {
        return param1;
    }

    public double getPraram2() {
        return praram2;
    }
}
