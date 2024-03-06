package br.com.fiap.springpjmotos.resource;


import br.com.fiap.springpjmotos.entity.Veiculo;
import br.com.fiap.springpjmotos.repository.VeiculoRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "localhost/veiculos")
public class VeiculoResource {

    @Autowired
    private VeiculoRepository repo;

    @GetMapping
    public List<Veiculo> findAll() {
        return repo.findAll();
    }

    @PostMapping
    public List<Veiculo> findAll(){return repo.findAll();}

    @GetMapping(value = "/{id}")
    public Veiculo findAll(@PathVariable("id") Long id) {
        var ret = repo.findById(id);
        return ret.get();
    }

    @GetMapping(value = "/{id}/acessorio")
    public Veiculo findAll(@PathVariable("id") Long id) {
        var ret = repo.findById(id);
        return ret.get();
    }

    @PostMapping(value = "/{id}/acessorio")
    public Veiculo findAll(@PathVariable("id") Long id) {
        var ret = repo.findById(id);
        return ret.get();
    }




}

