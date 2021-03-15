package dao;

public class Venda {

    private int idVenda;
    private int idCliente;
    private int idProdtuo;
    private String dthVenda;
    private int qtdeVenda;
    private int vlrUnitarioVenda;

    public Venda(int idVenda, String dthVenda, int qtdeVenda, int vlrUnitarioVenda) {
        this.idVenda = idVenda;
        this.idCliente = getIdCliente();
        this.idProdtuo = getIdProdtuo();
        this.dthVenda = dthVenda;
        this.qtdeVenda = qtdeVenda;
        this.vlrUnitarioVenda = vlrUnitarioVenda;
    }


    public int getIdVenda() {
        return idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdProdtuo() {
        return idProdtuo;
    }

    public String getDthVenda() {
        return dthVenda;
    }

    public int getQtdeVenda() {
        return qtdeVenda;
    }

    public int getVlrUnitarioVenda() {
        return vlrUnitarioVenda;
    }

    public int setIdVenda() {
        return idVenda;
    }

    public int setIdCliente() {
        return idCliente;
    }

    public int setIdProdtuo() {
        return idProdtuo;
    }

    public String setDthVenda() {
        return dthVenda;
    }

    public int setQtdeVenda() {
        return qtdeVenda;
    }

    public int setVlrUnitarioVenda() {
        return vlrUnitarioVenda;
    }

}
