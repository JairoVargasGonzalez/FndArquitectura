package entities;

import javax.persistence.*;

public class Usuario {

    private long id;
    private String documento;
    private String userName;
    private String nombre;
    private String mail;
    private boolean estado;
    private Rol rol;
    private Dependencia dependencia;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "ID_USUARIO_PK", nullable = false )
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column( name = "DOCUMENTO", nullable = false )
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Column( name = "USERNAME", nullable = false, unique = true )
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column( name = "NOMBRE", nullable = false )
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column( name = "EMAIL", nullable = false )
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Column( name = "ESTADO", nullable = false )
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @OneToOne
    @JoinColumn( name = "ID_ROL_FK", nullable = false )
    public Rol getRol() {
        return rol;}


    public void setRol(Rol rol) {
        this.rol = rol;
    }


    @ManyToOne( fetch = FetchType.EAGER )
    @JoinColumn( name = "ID_DEPENDENCIA_FK", nullable = false)
    public Dependencia getDependencia( ) {
        return dependencia;
    }

    public void setDependencia( Dependencia dependencia ) {
        this.dependencia = dependencia;
    }


    @Override
    public String toString() {
        return String.format("Dependencia [id=%d, documento=%s, userName=%s, nombre=%s, mail=%s, estado=%s, rol=%s, dependencia=%s]",
                id, documento, userName, nombre, estado, rol, dependencia);
    }
}

