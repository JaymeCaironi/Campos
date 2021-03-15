package dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String LOG = "DatabaseHelper";
    private static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "Campos.db";

    public static final String TABLE_USUARIOS = "usuarios";
    public static final String TABLE_PRODUTOS = "produtos";
    public static final String TABLE_VENDAS = "vendas";

    public static final String KEY_USU_ID = "idCliente";
    public static final String KEY_USU_NOME = "nmCliente";
    public static final String KEY_USU_CIDADE = "Cidade";

    public static final String KEY_PRO_ID = "idProduto";
    public static final String KEY_PRO_DESCRI = "dscProduto";
    public static final String KEY_PRO_VALOR = "vlrUnitario";

    public static final String KEY_VEN_ID = "idVenda";
    public static final String KEY_CLIVEN_ID = "idCliente";
    public static final String KEY_PROVEN_ID = "idProduto";
    public static final String KEY_VEN_QTD = "qtdeVenda";
    public static final String KEY_VEN_VALOR = "vlrUnitarioVenda";
    public static final String KEY_VEN_DATA = "dthVenda";

    private static final String CREATE_TABLE_USUARIOS = "CREATE TABLE "
            + TABLE_USUARIOS + "(" + KEY_USU_ID + " INTEGER PRIMARY KEY," + KEY_USU_NOME
            + " TEXT," + KEY_USU_CIDADE + " TEXT," +  ")";

    private static final String CREATE_TABLE_PRODUTOS = "CREATE TABLE "
            + TABLE_PRODUTOS + "(" + KEY_PRO_ID + " INTEGER PRIMARY KEY," + KEY_PRO_DESCRI
            + " TEXT," + KEY_PRO_VALOR + " INTEGER," +  ")";

    private static final String CREATE_TABLE_VENDAS = "CREATE TABLE "
            + TABLE_VENDAS + "(" + KEY_VEN_ID + " INTEGER PRIMARY KEY," + KEY_CLIVEN_ID + "INTEGER,"
            + KEY_PROVEN_ID + "INTEGER" + KEY_VEN_QTD + " INTEGER," + KEY_VEN_VALOR + " INTEGER,"
            + KEY_VEN_DATA + ")";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_USUARIOS);
        db.execSQL(CREATE_TABLE_PRODUTOS);
        db.execSQL(CREATE_TABLE_VENDAS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USUARIOS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUTOS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_VENDAS);

        onCreate(db);

    }

    public long createUsuario(Usuario usuario) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_USU_ID, usuario.getIdCiente());
        values.put(KEY_USU_NOME, usuario.getNmCliente());
        values.put(KEY_USU_CIDADE, usuario.getCidade());

        long idCliente = db.insert(TABLE_USUARIOS, null, values);

        return idCliente;

    }

    public long createProduto(Produto produto) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_PRO_ID, produto.getIdProduto());
        values.put(KEY_PRO_DESCRI, produto.getDscProduto());
        values.put(KEY_PRO_VALOR, produto.getVlrUnitario());

        long idProduto = db.insert(TABLE_PRODUTOS, null, values);

        return idProduto;

    }

    public long createVenda(Venda venda) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_VEN_ID, venda.getIdVenda());
        values.put(KEY_VEN_QTD, venda.getQtdeVenda());
        values.put(KEY_VEN_VALOR, venda.getVlrUnitarioVenda());
        values.put(KEY_VEN_DATA, venda.getDthVenda());


        long idVenda = db.insert(TABLE_VENDAS, null, values);

        return idVenda;

    }

}
