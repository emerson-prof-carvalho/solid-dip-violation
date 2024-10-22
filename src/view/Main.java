package view;

import model.NotificationService;

public class Main {

	public static void main(String[] args) {

		NotificationService notificationService = new NotificationService();

		notificationService.notifyUser("Seu código de acesso é @eac82");
	}
}