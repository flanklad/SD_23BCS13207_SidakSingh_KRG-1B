package com.seatbookingsystem.sdestq2.socialmedia.interfaces;

// ISP: separated so apps that don't support posts (e.g. WhatsApp) don't implement this
public interface SocialPostMedia {

    void publishPost(String author, String caption, String mediaPath);

    void likePost(String user, String postId);

    void commentOnPost(String user, String postId, String comment);
}
