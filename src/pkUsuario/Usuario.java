package pkUsuario;

public class Usuario {
    
    public String sgcodigo_amigo;
    public String sgnick_amigo;
    public Integer sgedad_amigo;
    public String sgsexo_amigo;

    // constructor
    public Usuario(){
    }

    public Usuario( String sgcodigo_amigo,
                  String sgnick_amigo,
                  Integer sgedad_amigo,
                  String sgsexo_amigo){

        this.sgcodigo_amigo = sgcodigo_amigo;
        this.sgnick_amigo = sgnick_amigo;
        this.sgedad_amigo = sgedad_amigo;
        this.sgsexo_amigo = sgsexo_amigo;
    }
}

