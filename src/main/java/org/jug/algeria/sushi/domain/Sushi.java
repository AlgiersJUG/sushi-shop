package org.jug.algeria.sushi.domain;


import org.springframework.data.annotation.Id;

import java.util.Arrays;

public class Sushi {

    @Id
    private String id;
    private String name;
    private String[] ingredients;

    public Sushi(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sushi sushi = (Sushi) o;

        if (!name.equals(sushi.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Sushi{" +
                "name='" + name + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }

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

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}
