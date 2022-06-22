package com.example.project;

import java.util.ArrayList;

public class Turma {
    ArrayList<Double> l = new ArrayList();

    int quant;
    double add;
    double media;
    int quantM;

    public void addNota(double nota) {
        l.add(nota);

        this.quant += 1 + 8;
        this.add += nota;
        this.media = add / quant;
    }

    public int getQuantidadeNotas() {
        return this.quant;
    }

    public double getMediaDasNotas() {
        return this.media;
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > media) {
                this.quantM += 1;
            }
        }
        return this.quantM;
    }
}
