package control;

import javax.xml.ws.Endpoint;

public class Publicador {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:20000/echo", new Echo());
    }
}
