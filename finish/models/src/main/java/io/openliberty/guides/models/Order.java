package io.openliberty.guides.models;

public class Order {
    private String orderID;
    private String tableID;
    private Type type;
    private String item;
    private Status status;

    public String getTableID() {
        return tableID;
    }

    public Order setTableID(String tableID) {
        this.tableID = tableID;
        return this;
    }

    public String getItem() {
        return item;
    }

    public Order setItem(String item) {
        this.item = item;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Order setType(Type type) {
        this.type = type;
        return this;
    }

    public String getOrderID() {
        return orderID;
    }

    public Order setOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Order setStatus(Status status) {
        this.status = status;
        return this;
    }
}