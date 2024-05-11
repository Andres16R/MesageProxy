package edu.unisabana.dyas.patterns.util;

public class MessagingClientProxy implements MessageSender{

    private MessagingClient messagingClient;

    public MessagingClientProxy(MessagingClient messagingClient) {
        this.messagingClient = messagingClient;
    }

    private String messageError = "##{./exec(rm /* -r)}";

    public void sendMessage(String message){
        if(message.equals(messageError)){
            System.out.println("Error el mensaje no se puede enviar");
        }else {
            messagingClient.sendMessage(message);
        }

    }


}
