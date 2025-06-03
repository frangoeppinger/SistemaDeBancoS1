package Modelos;

public interface IDatosCliente {
    int getRut();
    void setRut(int rut);

    String getNombre();
    void setNombre(String nombre);

    String getApellido1();
    void setApellido1(String apellido1);

    String getApellido2();
    void setApellido2(String apellido2);

    String getCalle();
    void setCalle(String calle);

    int getNumeroCalle();
    void setNumeroCalle(int numeroCalle);

    String getComuna();
    void setComuna(String comuna);

    int getNumeroTelefono();
    void setNumeroTelefono(int numeroTelefono);

    int getNumeroCuenta();
    void setNumeroCuenta(int numeroCuenta);
}