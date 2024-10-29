package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Produto {

    Long id;
    String nome;
    String descricao;
    BigDecimal preco;
    LocalDate dataCadastro;
    Categoria categoria;

}
