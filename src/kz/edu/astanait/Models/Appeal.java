package kz.edu.astanait.Models;

import java.util.Date;

public class Appeal{
    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone_number;
    private String micro_region;
    private String address;
    private String appeal;
    private String code;
    private Date sent_date;
    private Date response_date;
    private String answer;

    public Appeal(int id, String name, String surname, String email, String phone_number, String micro_region, String address, String appeal, String code, Date sent_date, Date response_date, String answer) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone_number = phone_number;
        this.micro_region = micro_region;
        this.address = address;
        this.appeal = appeal;
        this.code = code;
        this.sent_date = sent_date;
        this.response_date = response_date;
        this.answer = answer;
    }

    public Appeal(String name, String surname, String email, String phone_number, String micro_region, String address, String appeal, String code, Date sent_date, Date response_date, String answer) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone_number = phone_number;
        this.micro_region = micro_region;
        this.address = address;
        this.appeal = appeal;
        this.code = code;
        this.sent_date = sent_date;
        this.response_date = response_date;
        this.answer = answer;
    }

    public Appeal(String name, String surname, String email, String phone_number, String micro_region, String address, String appeal, String code) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone_number = phone_number;
        this.micro_region = micro_region;
        this.address = address;
        this.appeal = appeal;
        this.code = code;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCode() {
        return code;
    }

    public Date getSent_date() {
        return sent_date;
    }

    public Date getResponse_date() {
        return response_date;
    }

    public String getAnswer() {
        return answer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getMicro_region() {
        return micro_region;
    }

    public String getAddress() {
        return address;
    }

    public String getAppeal() {
        return appeal;
    }

    public void setAppeal(String appeal) {
        this.appeal = appeal;
    }
}
