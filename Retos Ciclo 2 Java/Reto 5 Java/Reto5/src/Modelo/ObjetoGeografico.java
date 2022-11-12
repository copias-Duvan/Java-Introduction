package Modelo;
public class ObjetoGeografico {
    
    private String nombre;
    private int id;
    private String municipio;
    private String TipoDeAgua;
    private String TipoCuerpoAgua;
    private float irca;

    
    public ObjetoGeografico(String nombre, int id, String municipio, String TipoDeAgua, String TipoCuerpoAgua, float irca) {
        this.nombre = nombre;
        this.id = id;
        this.municipio = municipio;
        this.irca = irca;
        this.TipoDeAgua = TipoDeAgua;
        this.TipoCuerpoAgua = TipoCuerpoAgua;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoDeAgua() {
        return TipoDeAgua;
    }

    public void setTipoDeAgua(String TipoDeAgua) {
        this.TipoDeAgua = TipoDeAgua;
    }

    public String getTipoCuerpoAgua() {
        return TipoCuerpoAgua;
    }

    public void setTipoCuerpoAgua(String TipoCuerpoAgua) {
        this.TipoCuerpoAgua = TipoCuerpoAgua;
    }
    public float getIrca() {
        return irca;
    }

    public void setIrca(float irca) {
        this.irca = irca;
    }
    
    
}
