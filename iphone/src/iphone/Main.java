package iphone;
//Interface para Reprodutor Musical
interface ReprodutorMusical {
 void tocarMusica();
 void pausarMusica();
 void pararMusica();
}

//Interface para Aparelho Telefônico
interface AparelhoTelefonico {
 void fazerChamada(String numero);
 void receberChamada();
}

//Interface para Navegador na Internet
interface NavegadorInternet {
 void navegar(String url);
 void favoritar(String url);
}

//Classe principal que representa o iPhone
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
 private String modelo;
 private int armazenamento; // em GB

 public iPhone(String modelo, int armazenamento) {
     this.modelo = modelo;
     this.armazenamento = armazenamento;
 }

 // Implementação dos métodos da interface ReprodutorMusical
 @Override
 public void tocarMusica() {
     System.out.println("Tocando música...");
 }

 @Override
 public void pausarMusica() {
     System.out.println("Música pausada.");
 }

 @Override
 public void pararMusica() {
     System.out.println("Música parada.");
 }

 // Implementação dos métodos da interface AparelhoTelefonico
 @Override
 public void fazerChamada(String numero) {
     System.out.println("Fazendo chamada para: " + numero);
 }

 @Override
 public void receberChamada() {
     System.out.println("Recebendo chamada...");
 }

 // Implementação dos métodos da interface NavegadorInternet
 @Override
 public void navegar(String url) {
     System.out.println("Navegando para: " + url);
 }

 @Override
 public void favoritar(String url) {
     System.out.println("Favoritando: " + url);
 }

 // Métodos adicionais, se necessário
 public String getModelo() {
     return modelo;
 }

 public int getArmazenamento() {
     return armazenamento;
 }
}

//Classe principal para testar o iPhone
public class Main {
 public static void main(String[] args) {
     iPhone meuIphone = new iPhone("iPhone 14", 128);
     
     // Testando as funcionalidades
     meuIphone.tocarMusica();
     meuIphone.pausarMusica();
     meuIphone.pararMusica();
     
     meuIphone.fazerChamada("123456789");
     meuIphone.receberChamada();
     
     meuIphone.navegar("https://www.example.com");
     meuIphone.favoritar("https://www.example.com");
 }
}