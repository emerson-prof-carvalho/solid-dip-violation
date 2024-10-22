# Dependency Inversion Principle (DIP)

### Esse projeto viola o DIP.

#### Problemas

- A classe `NotificationService` está **fortemente acoplada** a `EmailSender` e `SMSSender`. Qualquer alteração nessas classes ou se precisarmos mudar os métodos de envio, como enviar via WhatsApp ou outro canal, precisaremos modificar `NotificationService`, violando o DIP;
- Outra violação (que também levaria a mudanças na classe `NotificationService`), seria a necessidade de variar as formas de envio de notificações entre uma notificação e outra.
