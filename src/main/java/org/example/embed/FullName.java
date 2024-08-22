package org.example.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullName {
    private String first_name;
    private String last_name;

    public FullName(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public FullName() {
    }
}
