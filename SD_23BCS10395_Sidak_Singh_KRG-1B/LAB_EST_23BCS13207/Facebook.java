package com.seatbookingsystem.sdestq2.socialmedia;

import com.seatbookingsystem.sdestq2.socialmedia.interfaces.SocialGroupVideoCall;
import com.seatbookingsystem.sdestq2.socialmedia.interfaces.SocialMedia;
import com.seatbookingsystem.sdestq2.socialmedia.interfaces.SocialPostMedia;

import java.util.List;
public class Facebook implements SocialMedia, SocialPostMedia, SocialGroupVideoCall {

    @Override
    public void chatFunctionality(String sender, String receiver, String message) {
        System.out.println("[Facebook Messenger] " + sender + " → " + receiver + ": " + message);
    }
    @Override
    public void sendPhotoVideo(String sender, String receiver, String mediaPath) {
        System.out.println("[Facebook Messenger] " + sender + " sent media to " + receiver + ": " + mediaPath);
    }
    @Override
    public void publishPost(String author, String caption, String mediaPath) {
        System.out.println("[Facebook] " + author + " published a post: \"" + caption + "\" [" + mediaPath + "]");
    }
    @Override
    public void likePost(String user, String postId) {
        System.out.println("[Facebook] " + user + " liked post " + postId);
    }
    @Override
    public void commentOnPost(String user, String postId, String comment) {
        System.out.println("[Facebook] " + user + " commented on " + postId + ": \"" + comment + "\"");
    }
    @Override
    public void startGroupVideoCall(String host, List<String> participants) {
        System.out.println("[Facebook] " + host + " started a group video call with: " + participants);
    }
    @Override
    public void endGroupVideoCall(String callId) {
        System.out.println("[Facebook] Group video call " + callId + " ended.");
    }
    @Override
    public void muteParticipant(String callId, String participant) {
        System.out.println("[Facebook] " + participant + " was muted in call " + callId);
    }
}
