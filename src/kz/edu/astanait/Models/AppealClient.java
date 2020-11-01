package kz.edu.astanait.Models;

public class AppealClient {
    private int id;
    private String code;

    public AppealClient(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }
}
