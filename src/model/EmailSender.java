package model;

public class EmailSender {

	public void sendEmail(String message) {
		System.out.println(String.format("Novo e-mail \n%s\n", message));
	}
}
