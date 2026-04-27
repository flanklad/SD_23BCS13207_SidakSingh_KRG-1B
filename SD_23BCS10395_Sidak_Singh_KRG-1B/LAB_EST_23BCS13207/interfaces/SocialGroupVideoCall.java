package com.seatbookingsystem.sdestq2.socialmedia.interfaces;

import java.util.List;

// ISP: separated so apps without group video calls (e.g. Instagram) don't implement this
public interface SocialGroupVideoCall {

    void startGroupVideoCall(String host, List<String> participants);

    void endGroupVideoCall(String callId);

    void muteParticipant(String callId, String participant);
}
