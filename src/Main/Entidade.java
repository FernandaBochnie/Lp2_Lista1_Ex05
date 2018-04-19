

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
public class Entidade {
    private double maiornota;
    private double aux;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private String situacao;
    

    public double getAux() {
        return aux;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        media=(nota1*4+nota2*3+nota3*3)/10;
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public double getMaiornota() {
        return maiornota;
    }

    public void setMaiornota(double maiornota) {
        if (nota1>nota2) {
            aux=nota1;
            nota1=nota2;
            nota2=aux;
        }
        if (nota3>nota2) {
            aux=nota2;
            nota2=nota3;
            nota3=aux;
        }
        if (nota1>nota2) {
            aux=nota1;
            nota1=nota2;
            nota2=aux;
        }
        this.maiornota = maiornota;
    }

    public String getSituacao() {
        if (media>=60) {
            situacao="Aprovado";
            return situacao;
        }
        if (media<60) {
            situacao="Reprovado";
            return situacao;
        }
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
}
