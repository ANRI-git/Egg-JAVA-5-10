package Guia_8_REL_Ejercicio_02;

import java.util.Objects;

public class Player implements Comparable<Player>{

    private Integer ID;
    private String name;
    private Boolean status;

    public Player() {
    }

    public Player(Integer ID, String name, Boolean status) {
        this.ID = ID;
        this.name = name;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.ID);
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Player t) {
        return this.ID.compareTo(t.getID());
    }

}
