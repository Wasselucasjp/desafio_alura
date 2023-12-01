package br.com.api.TabelaFipe.service.interfaces;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
