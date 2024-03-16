package com.hayate.imajo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.hayate.imajo.entity.User;

public class UserDetail implements UserDetails {
    private static final long serialVersionUID = 1L;

    private final User user;
    private final List<SimpleGrantedAuthority> authorities;


    public UserDetail(User user) {
        this.user = user;

        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
        this.authorities = authorities;
    }

    public User getUser() {
        return user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        // 期限切れでなければtrueを返す
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // ロックされていなければtrueを返す
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // パスワードが期限切れでなければtrueを返す
        return true;
    }

    @Override
    public boolean isEnabled() {
        // 有効であればtrueを返す
        return true;
    }
}
