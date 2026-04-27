package com.seatbookingsystem.sdestq2.socialmedia;

import java.util.List;

public class SocialMediaDemo {

    public static void main(String[] args) {

        System.out.println("===== INSTAGRAM =====");
        Instagram instagram = new Instagram();
        instagram.chatFunctionality("alice", "bob", "Hey! Check this out.");
        instagram.sendPhotoVideo("alice", "bob", "sunset.jpg");
        instagram.publishPost("alice", "Golden hour vibes", "sunset.jpg");
        instagram.likePost("bob", "POST_001");
        instagram.commentOnPost("bob", "POST_001", "Stunning shot!");

        System.out.println("\n===== WHATSAPP =====");
        WhatsApp whatsApp = new WhatsApp();
        whatsApp.chatFunctionality("alice", "bob", "Are you joining the call?");
        whatsApp.sendPhotoVideo("alice", "bob", "document.pdf");
        whatsApp.startGroupVideoCall("alice", List.of("bob", "charlie", "diana"));
        whatsApp.muteParticipant("CALL_101", "charlie");
        whatsApp.endGroupVideoCall("CALL_101");

        System.out.println("\n===== FACEBOOK =====");
        Facebook facebook = new Facebook();
        facebook.chatFunctionality("alice", "bob", "Long time no see!");
        facebook.sendPhotoVideo("alice", "bob", "vacation.mp4");
        facebook.publishPost("alice", "Summer trip highlights", "vacation.mp4");
        facebook.likePost("bob", "POST_202");
        facebook.commentOnPost("bob", "POST_202", "Looks amazing!");
        facebook.startGroupVideoCall("alice", List.of("bob", "charlie"));
        facebook.muteParticipant("CALL_202", "bob");
        facebook.endGroupVideoCall("CALL_202");
    }
}
