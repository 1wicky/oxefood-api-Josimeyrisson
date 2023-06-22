package br.com.ifpe.oxefood.api.comprador;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.comprador.Comprador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompradorRequest {

   private Long id;

   private Long versao;

   private String nome;
   
   private String enderecoComercial;

   private String enderecoResidencial;

   private Double comissao;

   private Boolean trabalhoHomeOffice;

   private Integer qtdComprasMediasMes;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate contratadoEm;

 
   public Comprador build() {

       return Comprador.builder()
               .id(id)
               .versao(versao)
               .nome(nome)
               .enderecoComercial(enderecoComercial)
               .enderecoResidencial(enderecoResidencial)
               .comissao(comissao)
               .trabalhoHomeOffice(trabalhoHomeOffice)
               .qtdComprasMediasMes(qtdComprasMediasMes)
               .contratadoEm(contratadoEm)
               .build();
   }
}