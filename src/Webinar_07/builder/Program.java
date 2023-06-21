package Webinar_07.builder;

public class Program {
    public static void main(String[] args) {
        MailMessage mailMessage = new MailMassageBuilder()
                .setFrom("from@mail.com")
                .setTo("")
                .setBody("text masssage")
                .build();
    }
}
