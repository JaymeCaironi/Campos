package dao;

public class Usuario {

    private int idCiente;
    private String nmCliente;
    private String cidade;

    public Usuario(int idCliente, String nmCliente, String cidade) {
        this.idCiente= idCliente;
        this.nmCliente = nmCliente;
        this.cidade = cidade;
    }


    public int getIdCiente() {
        return idCiente;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public String getCidade() {
        return cidade;
    }

    public int setIdCiente() {
        return idCiente;
    }

    public String setNmCliente() {
        return nmCliente;
    }

    public String setCidade() {
        return cidade;
    }

}
