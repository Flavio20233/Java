public class Secretario extends Funcionario {
    private String turno;

    public int getRamal() {
        return ramal();

    }
    public void setRamal(int ramal){
        this.ramal = ramal;

    }
    public String getTurno(){
        return turno ;
    }
    public void setTurno (String turno){
        this.turno = turno;
    }
    public String marcarreuniao(Date datareuniao,String nome){
        SimpleDateFormat fs = new SimpleDateFormat(dd/mm/yyyy);


        return "reuniao marcada dia " + fs.format(dataReuniao) + " com o gerente " + nome +".";
    }

}
