package com.seatbookingsystem.sdestq2.socialmedia;

import com.seatbookingsystem.sdestq2.socialmedia.interfaces.SocialGroupVideoCall;
import com.seatbookingsystem.sdestq2.socialmedia.interfaces.SocialMedia;

import java.util.List;

// WhatsApp uses chat + group video calls, but NOT post publishing — ISP lets us omit SocialPostMedia
public class WhatsApp implements SocialMedia, SocialGroupVideoCall {

    @Override
    public void chatFunctionality(String sender, String receiver, String message) {
        System.out.println("[WhatsApp] " + sender + " → " + receiver + ": " + message);
    }
    @Override
    public void sendPhotoVideo(String sender, String receiver, String mediaPath) {
        System.out.println("[WhatsApp] " + sender + " sent media to " + receiver + ": " + mediaPath);
    }
    @Override
    public void startGroupVideoCall(String host, List<String> participants) {
        System.out.println("[WhatsApp] " + host + " started a group video call with: " + participants);
    }

    @Override
    public void endGroupVideoCall(String callId) {
        System.out.println("[WhatsApp] Group video call " + callId + " ended.");
    }

    @Override
    public void muteParticipant(String callId, String participant) {
        System.out.println("[WhatsApp] " + participant + " was muted in call " + callId);
    }
}
