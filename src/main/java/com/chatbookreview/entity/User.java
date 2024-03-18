package com.chatbookreview.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    public static enum Role {
        GENERAL("一般"), ADMIN("管理者");

        private String name;

        private Role(String name) {
            this.name = name;
        }

        public String getValue() {
            return this.name;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // ID
    private Integer id;

    // ユーザー名
    private String username;

    // パスワード
    private String password;

    // 権限
    @Enumerated(EnumType.STRING)
    private Role role;

}
