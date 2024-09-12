# Projeto: Simulação de Controle de Smart TV

Este projeto simula o controle de uma **Smart TV** usando duas classes principais: `Usuario` e `SmartTv`. O programa permite ligar/desligar a TV, ajustar o volume e mudar o canal por meio de métodos simulando o comportamento de um controle remoto.

## Funcionalidades

1. **Ligar/Desligar a TV**: O estado da TV é controlado pelos métodos `ligar()` e `desligar()`.
2. **Controle de Volume**:
   - Aumentar o volume: `aumentarVolume()`
   - Diminuir o volume: `diminuirVolume()`
3. **Controle de Canal**:
   - Aumentar/Diminuir canal: `aumentarCanal()` e `diminuirCanal()`
   - Mudar para um canal específico: `mudarCanal(int novoCanal)`

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### Classe `Usuario`

A classe `Usuario` contém o método `main`, que é o ponto de entrada do programa. Ela simula interações com a TV utilizando a instância da classe `SmartTv`.

#### Exemplo de uso:
```java
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
