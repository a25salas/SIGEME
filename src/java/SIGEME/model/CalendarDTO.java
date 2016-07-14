/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEME.model;

import java.io.Serializable;

/**
 *
 * @author a25salas
 */
public class CalendarDTO implements Serializable, SIGEME.model.Jsonable{
     public int id;
    public String title;
    public String description;
    public String date;
    public String end;
    public String color;

    public String getDescripcion() {
        return description;
    }

    public void setDescripcion(String description) {
        this.description = description;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "CalendarDTO{" + "id=" + id + ", title=" + title + ", date=" + date + ", end=" + end + ", color=" + color + '}';
    }
    
    
}
