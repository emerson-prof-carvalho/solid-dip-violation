package model;

public class NotificationService {

	private EmailSender emailSender;
	private SMSSender smsSender;

	// NotificationService é acoplada aos tipos de notificadores
	public NotificationService() {
		this.emailSender = new EmailSender();
		this.smsSender = new SMSSender();
	}

	public void notifyUser(String message) {
		emailSender.sendEmail(message);
		
		smsSender.sendSMS(message);
	}
}
