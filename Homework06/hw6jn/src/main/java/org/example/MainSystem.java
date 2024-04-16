package org.example;

import java.util.Iterator;
import java.util.List;



public class MainSystem {
    private static final ChatServer chatServer = new ChatServer();

    public static void main(String[] args) {
        //creating 4 users and adding them to system
        User roomfrnd1 = new User("Chaitanya Nalage", chatServer);
        User roomfrnd2 = new User("Rituraj Gharat", chatServer);
        User roomfrnd3 = new User("Aryan Dive", chatServer);
        User roomfrnd4 = new User("Sanika Kubal", chatServer);
        System.out.println("\n------------------------ User's Created ------------------------");


        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd2), "Rituraj, hello! What's for supper this evening?"));
        chatServer.sendMessage(new Message(roomfrnd4, List.of(roomfrnd2), "Hello, Rituraj How do you feel right now?"));
        chatServer.sendMessage(new Message(roomfrnd2, List.of(roomfrnd4), "Hi, Sanika Thank you for your inquiry, unfortunately things have become worse."));
        chatServer.sendMessage(new Message(roomfrnd4, List.of(roomfrnd1), "Chaitanya, I appreciate you not asking me what to eat."));
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd3), "Hello, Aryan Is chicken on the menu for today, or are you still sticking to vegetarian food?"));
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd4), "I apologize so much, Sanika. What would you want to eat?"));
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "Greetings, Chaitanya I'm not eating meat, so I can't have chicken."));
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("\n------------------------ Demonstrating block function ------------------------");
        roomfrnd2.blockerUsers(roomfrnd1);
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd2, roomfrnd3), "Aryan, take me to the Cheesecake Factory, please!"));
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "So, Chaitanya, why cheesecake factory?"));
        System.out.println("----------------------------------");
        System.out.println("\n------------------------ Demonstrating block function ------------------------");
        System.out.println("Aryan Dive unsent last message");
        chatServer.undoLastMessage(roomfrnd3);
        System.out.printf("Now, Aryan Dive's last message is '%s'\n", roomfrnd3.getChatHistory().getLastSentMessages());
        System.out.println("----------------------------------");
        System.out.println("\n===== Demonstrating unsent function =====");
        System.out.println("Rituraj Gharat unsent last message:");
        chatServer.undoLastMessage(roomfrnd2);
        System.out.println("----------------------------------");
        // Trying iterating over all messages in user3's chat history
        System.out.println("Iterating over all messages in Aryan Dive's chat history:");
        Iterator<Message> allMessagesIterator = roomfrnd3.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        // Trying iterating over all messages in user1's chat history
        System.out.println("Iterating over all messages in Chaitanya Nalage's chat history:");
        allMessagesIterator = roomfrnd1.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        // Trying iterating over all messages in user4's chat history
        System.out.println("Iterating over all messages in Sanika Kubal chat history:");
        allMessagesIterator = roomfrnd4.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        chatServer.unregisterUser(roomfrnd1);
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "Since I'd like to have the cheesecakes from there."));
    }
}
