package com.seatbookingsystem.sdestq2.socialmedia;

import com.seatbookingsystem.sdestq2.socialmedia.interfaces.SocialMedia;
import com.seatbookingsystem.sdestq2.socialmedia.interfaces.SocialPostMedia;

// Instagram uses chat + posts, but NOT group video calls — ISP lets us omit SocialGroupVideoCall
public class Instagram implements SocialMedia, SocialPostMedia {

    @Override
    public void chatFunctionality(String sender, String receiver, String message) {
        System.out.println("[Instagram DM] " + sender + " → " + receiver + ": " + message);
    }

    @Override
    public void sendPhotoVideo(String sender, String receiver, String mediaPath) {
        System.out.println("[Instagram DM] " + sender + " sent media to " + receiver + ": " + mediaPath);
    }

    @Override
    public void publishPost(String author, String caption, String mediaPath) {
        System.out.println("[Instagram Post] @" + author + " posted: \"" + caption + "\" [" + mediaPath + "]");
    }

    @Override
    public void likePost(String user, String postId) {
        System.out.println("[Instagram] @" + user + " liked post " + postId);
    }

    @Override
    public void commentOnPost(String user, String postId, String comment) {
        System.out.println("[Instagram] @" + user + " commented on " + postId + ": \"" + comment + "\"");
    }
}
