package dao;

public class Produto {

    private int idProduto;
    private String dscProduto;
    private int vlrUnitario;

    public Produto(int idProduto, String dscProduto, int vlrUnitario) {
        this.idProduto= idProduto;
        this.dscProduto = dscProduto;
        this.vlrUnitario = vlrUnitario;
    }


    public int getIdProduto() {
        return idProduto;
    }

    public String getDscProduto() {
        return dscProduto;
    }

    public int getVlrUnitario() {
        return vlrUnitario;
    }


    public int setIdProduto() {
        return idProduto;
    }

    public String setDscProduto() {
        return dscProduto;
    }

    public int setVlrUnitario() {
        return vlrUnitario;
    }

}
