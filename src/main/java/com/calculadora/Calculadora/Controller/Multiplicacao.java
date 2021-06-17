package com.calculadora.Calculadora.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.Calculadora.Entity.Resultado;
import com.calculadora.Calculadora.Entity.Variavel;

	@RestController
	@RequestMapping("/mul")
	public class Multiplicacao {

		//   http://localhost:8080/mul?a=2&b=2
		
		@GetMapping
		public ResponseEntity<Resultado> getMul(@RequestParam(value ="a", required =false) float a1, @RequestParam(value ="b", required = false) float b1) {
			List<Resultado> lista = new ArrayList<Resultado>();
			Variavel variavel = new Variavel();
			variavel.setA(a1);
			variavel.setB(b1);
			
			Resultado resultado = new Resultado(); 
			float result = variavel.getA() * variavel.getB();
			resultado.setResult(result);
			lista.add(resultado);
			
			return new ResponseEntity<Resultado>(resultado, HttpStatus.OK);
		}
		
			
	}
