# 🎮 Pokémon Battle Engine - Java OOP

Este proyecto es un simulador de combate Pokémon por turnos desarrollado en Java. El objetivo principal es demostrar la implementación práctica de los pilares de la **Programación Orientada a Objetos (POO)**.

## 🧠 Conceptos de POO Aplicados

* **Abstracción:** Definición de la superclase `Pokemon` que establece los atributos (nombre, nivel, HP) y comportamientos base de cualquier criatura.
* **Herencia:** Implementación de subclases especializadas (`PokemonFuego`, `PokemonPlanta`, `PokemonAgua`) que heredan y extienden la funcionalidad de la clase base.
* **Polimorfismo:** Uso de la anotación `@Override` en el método `atacar`. Cada tipo de Pokémon redefine su lógica de combate para calcular multiplicadores de daño según el tipo del objetivo (Triángulo de Tipos).
* **Encapsulamiento:** Protección de la integridad de los datos mediante modificadores de acceso `private` y `protected`, gestionando el estado interno (HP) a través de métodos controlados como `getHp()` y `recibirDano()`.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 17+
* **Entorno:** Consola interactiva (Scanner)

## 🕹️ Cómo ejecutar
1. Clona el repositorio.
2. Compila todos los archivos `.java`.
3. Ejecuta la clase `Coliseo` para iniciar el combate interactivo.
