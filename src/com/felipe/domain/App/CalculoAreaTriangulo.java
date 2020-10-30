package com.felipe.domain.App;


import com.felipe.domain.Triangulo;
import com.felipe.domain.TrianguloEquilatero;
import com.felipe.domain.TrianguloIsosceles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculoAreaTriangulo {

    public static void main(String[] args) {

        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(2.0, 2.0);
        TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles(3.0, 4.5);

        List<Triangulo>triangulosx = new ArrayList<>(Arrays.asList(trianguloIsosceles, trianguloEquilatero));
        caclularAreaCompleta(triangulosx);


    }


        public static void caclularAreaCompleta(List<Triangulo> triangulos){

            triangulos.forEach(triangulo -> {
                System.out.println(triangulo + "-Area" + triangulo.calcularAreaTriangulo());
            });

    }

        }


