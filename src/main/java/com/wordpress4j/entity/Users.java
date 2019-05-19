package com.wordpress4j.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wordpress4j.util.TableUtils;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author souvc
 */
@Data
@Entity
@Table(name = TableUtils.TABLE_PREFIX + "users" + TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX + "users" + TableUtils.TABLE_SUFFIX)
public class Users implements UserDetails, Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, length = 20)
    private Long id;

    @Column(name = "user_login", length = 60)
    private String userLogin;

    @Column(name = "user_pass", length = 255)
    private String userPass;

    @Column(name = "user_nicename", length = 50)
    private String userNicename;

    @Column(name = "user_email", length = 100)
    private String userEmail;

    @Column(name = "user_url", length = 100)
    private String userUrl;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "user_registered")
    private Date userRegistered;

    @Column(name = "user_activation_key", length = 255)
    private String userActivationKey;

    @Column(name = "user_status", length = 11)
    private Integer userStatus;

    @Column(name = "display_name", length = 250)
    private String displayName;


    /**
     * ---------- 实现 spring security 用户 -------------------
     * @return
     */
    @TableField(exist = false)
    @ManyToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> list = new ArrayList<>();
        List<Role> roles = this.getRoles();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority(role.getName()));
        }
        return list;
    }

    @Override
    public String getPassword() {
        return this.userPass;
    }

    @Override
    public String getUsername() {
        return this.userLogin;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.userStatus.equals(0);
    }
}