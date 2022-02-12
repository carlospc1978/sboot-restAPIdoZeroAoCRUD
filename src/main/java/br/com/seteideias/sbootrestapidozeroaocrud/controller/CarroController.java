package br.com.seteideias.sbootrestapidozeroaocrud.controller;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Carros;
import br.com.seteideias.sbootrestapidozeroaocrud.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class CarroController {

    CarroRepository carroRepository;

    @GetMapping("/carros")
    public List<Carros> getTodosOsCarros(){
        return carroRepository.findAll();
    }

    @GetMapping("/carros/{id}")
    public Optional<Carros> getCarroPelaId(@PathVariable Long id) {
        return carroRepository.findById(id);
    }

    @PostMapping("/carros")
    public Carros salvarUmNovoCarro(@RequestBody Carros carros){
        return carroRepository.save(carros);
    }

    @DeleteMapping("/carros/{id}")
    public void deletarUmCarroPelaID(@PathVariable Long id){
        carroRepository.deleteById(id);
    }



}
