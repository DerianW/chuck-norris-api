package io.curly.chucknorrisapi.hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Array;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String joke;
    private Array category;

    public Value() {}

    public Long getId() { return this.id; }
    public String getJoke() { return this.joke; }
    public void setId(Long id) { this.id = id; }
    public void setJoke(String joke) { this.joke = joke; }
    public Array getCategory() { return category; }
    public void setCategory(Array category) { this.category = category; }

    @Override
    public String toString() {
        return "Value{" +
                "id:" + id +
                ", joke:'" + joke +
                ", category:'" + category +
                '\'' + '}';
    }
}
