package com.hmtmcse.email;

public class SMTPConfig {

    public static final String TLS = "TLS";
    public static final String SSL = "SSL";

    public String host;
    public String username;
    public String password;
    public String sendFrom;
    public String port;
    public Boolean auth = true;
    public String encryption = TLS;

    public String getHost() {
        return host;
    }

    public SMTPConfig setHost(String host) {
        this.host = host;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public SMTPConfig setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public SMTPConfig setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPort() {
        return port;
    }

    public SMTPConfig setPort(String port) {
        this.port = port;
        return this;
    }

    public Boolean getAuth() {
        return auth;
    }

    public SMTPConfig setAuth(Boolean auth) {
        this.auth = auth;
        return this;
    }

    public String getEncryption() {
        return encryption;
    }

    public SMTPConfig setEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    public String getSendFrom() {
        return sendFrom;
    }

    public SMTPConfig setSendFrom(String sendFrom) {
        this.sendFrom = sendFrom;
        return this;
    }
}
