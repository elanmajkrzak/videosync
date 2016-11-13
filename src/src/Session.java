/**
 * Created by Elan Majkrzak on 11/13/2016.
 */
public class Session {
    private Client host;
    private Client[] users;

    Session(Client host) {
        this.host = host;
    }

    Session(Client host, Client[] users) {
        this.host = host;
        this.users = users;
    }
}
