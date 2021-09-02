package com.example.calculatorfx_212;

public class Calculator {
   private double number1;
   private double number2;
   private double result;
   private Operation operation;

   public double getNumber1() {
      return number1;
   }

   public void setNumber1(double number1) {
      this.number1 = number1;
   }

   public double getNumber2() {
      return number2;
   }

   public void setNumber2(double number2) {
      this.number2 = number2;
   }

   public double getResult() {
      return result;
   }

   public Operation getOperation() {
      return operation;
   }

   public void setOperation(Operation operation) {
      this.operation = operation;
   }

   public boolean calculate() {
      switch (operation) {
         case plus:
            result = number1 + number2;
            break;
         case minus:
            result = number1 - number2;
            break;
         case mult:
            result = number1 * number2;
            break;
         case division:
            if (number2 == 0) return false;
            else result = number1 / number2;
            break;
         case sqrt:
            if (number1 < 0) return false;
            else result = Math.sqrt(number1);
      }

      return true;
   }
}
