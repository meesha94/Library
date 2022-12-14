package org.example;

public class User extends People{
    public int id;
    public String name;
    public boolean admin;

    public User(int id, String name, boolean admin) {
        super(id, name, admin);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
