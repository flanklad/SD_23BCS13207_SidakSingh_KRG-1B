package com.seatbookingsystem.sdestq2.socialmedia.interfaces;

// ISP: core messaging features shared by all social media apps
public interface SocialMedia {

    void chatFunctionality(String sender, String receiver, String message);

    void sendPhotoVideo(String sender, String receiver, String mediaPath);
}
