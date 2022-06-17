package com.example.project;

public class Turma {
    int quant;
    double add;
    double media;
    int quantM;

    public void addNota(double nota) {
        this.quant += 1;
        this.add += nota;
        this.media = add / quant;
        if (nota > media) {
            this.quantM += 1;
        }
    }

    public int getQuantidadeNotas() {
        return this.quant;
    }

    public double getMediaDasNotas() {
        return this.media;
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        return quantM;
    }
}
