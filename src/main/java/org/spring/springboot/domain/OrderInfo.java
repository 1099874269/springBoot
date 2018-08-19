package org.spring.springboot.domain;

public class OrderInfo {
    private String id;
    private String name;
    private String IDno;
    private String tellNo;
    private String account;
    private String password;
    private String startData;
    private String startStation;
    private String endStation;
    private String trains;
    private String type;
    private String status; //0未付款 1已付款 2交易完成 3退款中 4退款成功
    private String isValid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDno() {
        return IDno;
    }

    public void setIDno(String IDno) {
        this.IDno = IDno;
    }

    public String getTellNo() {
        return tellNo;
    }

    public void setTellNo(String tellNo) {
        this.tellNo = tellNo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStartData() {
        return startData;
    }

    public void setStartData(String startData) {
        this.startData = startData;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getTrains() {
        return trains;
    }

    public void setTrains(String trains) {
        this.trains = trains;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", IDno='" + IDno + '\'' +
                ", tellNo='" + tellNo + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", startData='" + startData + '\'' +
                ", startStation='" + startStation + '\'' +
                ", endStation='" + endStation + '\'' +
                ", trains='" + trains + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", isValid='" + isValid + '\'' +
                '}';
    }
}
