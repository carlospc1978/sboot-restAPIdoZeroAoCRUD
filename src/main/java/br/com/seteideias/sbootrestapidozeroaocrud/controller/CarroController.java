package br.com.seteideias.sbootrestapidozeroaocrud.controller;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Carro;
import br.com.seteideias.sbootrestapidozeroaocrud.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class CarroController {

    CarroRepository carroRepository;

    @GetMapping("/carro")
    public List<Carro> getTodosOsCarros(){
        return carroRepository.findAll();
    }

    @GetMapping("/carro/{id}")
    public Optional<Carro> getCarroPelaId(@PathVariable Long id) {
        return carroRepository.findById(id);
    }

    @PostMapping("/carro")
    public Carro salvarUmNovoCarro(@RequestBody Carro carros){
        return carroRepository.save(carros);
    }

    @DeleteMapping("/carro/{id}")
    public void deletarUmCarroPelaID(@PathVariable Long id){
        carroRepository.deleteById(id);
    }



}
