package models;

public class Partida {

    private Selecao selecaoA;
    private Selecao selecaoB;
    private String status; //Pendente, Andamento, Finalizada
    private int GolsSelecaoA;
    private int GolsSelecaoB;
    private String codigo;
    private String data;
    private String horario;
    private String local;

    public Selecao getSelecaoA() {
        return selecaoA;
    }

    public void setSelecaoA(Selecao selecaoA) {
        this.selecaoA = selecaoA;
    }

    public Selecao getSelecaoB() {
        return selecaoB;
    }

    public void setSelecaoB(Selecao selecaoB) {
        this.selecaoB = selecaoB;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGolsSelecaoA() {
        return GolsSelecaoA;
    }

    public void setGolsSelecaoA(int golsSelecaoA) {
        GolsSelecaoA = golsSelecaoA;
    }

    public int getGolsSelecaoB() {
        return GolsSelecaoB;
    }

    public void setGolsSelecaoB(int golsSelecaoB) {
        GolsSelecaoB = golsSelecaoB;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }



}
