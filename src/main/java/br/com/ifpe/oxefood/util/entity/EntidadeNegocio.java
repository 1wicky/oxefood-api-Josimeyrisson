package br.com.ifpe.oxefood.util.entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
@MappedSuperclass
public abstract class EntidadeNegocio implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;

   @JsonIgnore
   @Column
   private Boolean habilitado;
  
}
