package Webinar_07.builder;

public class MailMassageBuilder {

    private MailMessage mailMessage;

    public MailMessage build() {
        if (mailMessage.getTo() == null || mailMessage.getTo().equals(""))
            throw new RuntimeException("Получатель должен быть указан!");
        return mailMessage;
    }

    public MailMassageBuilder() {
        mailMessage = new MailMessage();
    }


    public MailMassageBuilder setFrom(String address) {
        mailMessage.setFrom(address);
        return this;//возвращаем ссылку на текущий экземпляр обьекта
    }

    public MailMassageBuilder setTo(String to) {
        mailMessage.setTo(to);
        return this;
    }

    public MailMassageBuilder setSubject(String subject) {
        mailMessage.setSubject(subject);
        return this;
    }

    public MailMassageBuilder setBody(String body) {
        mailMessage.setBody(body);
        return this;
    }

    public MailMassageBuilder setParam1(int param1) {
        mailMessage.setParam1(param1);
        return this;
    }

    public MailMassageBuilder setPraram2(double praram2) {
        mailMessage.setPraram2(praram2);
        return this;
    }


}
