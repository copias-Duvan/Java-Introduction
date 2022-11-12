/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duvan
 */
public class ObjetoGeografico {
    private String nombreEntidad;  
    private String idEntidad;
    private String municipioEntidad;
    private String tipoCuerpoAgua;
    private String tipoAgua;
    private float numIrca;
    
    //CONSTRUCTORES
    public ObjetoGeografico(){
        
    }

    public ObjetoGeografico(String nombreEntidad, String idEntidad, String municipioEntidad, String tipoCuerpoAgua, String tipoAgua, int numIrca) {
        this.nombreEntidad = nombreEntidad;
        this.idEntidad = idEntidad;
        this.municipioEntidad = municipioEntidad;
        this.tipoCuerpoAgua = tipoCuerpoAgua;
        this.tipoAgua = tipoAgua;
        this.numIrca = numIrca;
    }
    
    
    //METODOS SET Y GET
    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public String getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(String idEntidad) {
        this.idEntidad = idEntidad;
    }

    public String getMunicipioEntidad() {
        return municipioEntidad;
    }

    public void setMunicipioEntidad(String municipioEntidad) {
        this.municipioEntidad = municipioEntidad;
    }

    public String getTipoCuerpoAgua() {
        return tipoCuerpoAgua;
    }

    public void setTipoCuerpoAgua(String tipoCuerpoAgua) {
        this.tipoCuerpoAgua = tipoCuerpoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
   
    public float getNumIrca() {
        return numIrca;
    }
    
    public void setNumIrca(float numIrca) {
        this.numIrca = numIrca;
    }
}
