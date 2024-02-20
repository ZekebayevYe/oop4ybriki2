package com.example.oopaer.models;

import jakarta.persistence.*;
import lombok.*;

@Setter
@NoArgsConstructor

    @Data
    @Entity
    @Table(name = "users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String login;
        private String password;
        private boolean typeofaccount;

        public int getId() {
            return id;
        }

        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }

        public boolean getTypeOfAccount() {
            return typeofaccount;
        }


    }

