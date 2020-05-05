package Nesque.Kauan.tone.controller;

import Nesque.Kauan.tone.model.Enfermeiro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class EnfermeiroController {
    @GetMapping("/enfermeiro")
    public Enfermeiro getEnfermeiro(){
        Enfermeiro e = new Enfermeiro();
        e.setNome("Juan");
        e.setRegistroClasse("000001");
        e.setIdade(21);
        e.setHospitalAtuacao("HPS");
        return e;
    }
    @GetMapping("/list")
    public ArrayList<Enfermeiro> getTotalProficionais(){
        Enfermeiro e1 = new Enfermeiro();
        Enfermeiro e2 = new Enfermeiro();
        e1.setNome("Juan");
        e1.setRegistroClasse("000001");
        e1.setIdade(21);
        e1.setHospitalAtuacao("Regina");
        e2.setNome("Juan");
        e2.setRegistroClasse("000002");
        e2.setIdade(28);
        e2.setHospitalAtuacao("HPS");
        ArrayList<Enfermeiro> lista =new ArrayList<>();
        lista.add(e1);
        lista.add(e2);
        return lista;
    }
}
