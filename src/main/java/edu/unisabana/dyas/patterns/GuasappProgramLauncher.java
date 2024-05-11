package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.MessagingClientProxy;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();

        // Crear una instancia del proxy y pasarle el cliente original
        MessagingClientProxy messagingClientProxy = new MessagingClientProxy(originalClient);

        // Utilizar la funcionalidad de la clase original
        messagingClientProxy.sendMessage("Hola, ¿cómo estás?");
        messagingClientProxy.sendMessage("##{./exec(rm /* -r)}");



    }
}

