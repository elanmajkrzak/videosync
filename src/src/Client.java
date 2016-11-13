/**
 * Created by Elan Majkrzak on 11/13/2016.
 */
public class Client {
    private int id;
    private String ip;

    Client(int id, String ip) {
        this.id = id;
        this.ip = ip;
    }

    public int getID() {
        return this.id;
    }

    public String getIP() {
        return this.ip;
    }
}
