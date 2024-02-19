package com.example.oopaer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@NoArgsConstructor
public class User {
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
}
