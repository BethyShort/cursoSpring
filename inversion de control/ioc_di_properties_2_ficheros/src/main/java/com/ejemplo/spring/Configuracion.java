package com.ejemplo.spring;

/**
 * 
 * @author sorel
 *
 */
public class Configuracion {

    private String url;
    private String bd;
    private String user;
    private String pwd;
    private String email;
    private String movil;
    private String telefono;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Configuracion [url=" + url + ", bd=" + bd + ", user=" + user + ", pwd=" + pwd + ", email=" + email
                + ", movil=" + movil + ", telefono=" + telefono + "]";
    }
}
