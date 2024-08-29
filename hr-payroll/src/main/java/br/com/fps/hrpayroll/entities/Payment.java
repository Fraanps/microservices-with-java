package br.com.fps.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@NoArgsConstructor
@Getter
@Setter
public class Payment implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private Double dailyIncome;
  private Integer days;

  public Payment(String name, Double dailyIncome, Integer days) {
    this.name = name;
    this.dailyIncome = dailyIncome;
    this.days = days;
  }

  private Double getTotal(){
    return days * dailyIncome;
  }
}
