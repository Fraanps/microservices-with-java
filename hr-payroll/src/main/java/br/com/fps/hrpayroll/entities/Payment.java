package br.com.fps.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private Double dailyIncome;
  private Integer days;


  private Double getTotal(){
    return days * dailyIncome;
  }
}
