public class Gerente extends Funcionario  {
   private String usuario;
   private String departamento;
   static int identificador = 0;
   
    public static int getIdentificador() {
        return identificador;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public Gerente(){
        identificador=identificador + 1;
    }
    

}
    

