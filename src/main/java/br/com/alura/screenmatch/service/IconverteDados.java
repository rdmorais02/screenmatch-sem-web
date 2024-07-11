package br.com.alura.screenmatch.service;

public interface IconverteDados {
   <T> T obterDados(String json, Class<T> Class);

}
