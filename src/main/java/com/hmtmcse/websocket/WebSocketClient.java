package com.hmtmcse.websocket;

import com.hmtmcse.common.TMException;

import javax.websocket.WebSocketContainer;
import java.net.URI;
import java.io.IOException;
import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;


@ClientEndpoint
public class WebSocketClient {

    private Session session;

    public WebSocketClient(String uri) throws TMException {
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            container.connectToServer(this, new URI(uri));
        } catch (Exception ex) {
            throw new TMException(ex.getMessage());
        }
    }


    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
    }


    @OnMessage
    public void onMessage(String message, Session session) {}


    public void sendMessage(String message) throws TMException {
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException ex) {
            throw new TMException(ex.getMessage());
        }
    }
}
