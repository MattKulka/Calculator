package com.example.calculator;

public class Calculator {
    private static final String INITIAL_VALUE = "0";

    public String input;
    private String previousInput;
    private Operator operator;
    private Boolean clearInput;


    public Calculator(){
        this.input= INITIAL_VALUE;
        this.previousInput = INITIAL_VALUE;
        this.clearInput = false;
    }

    public void inputNumber(Integer number) {
        if (clearInput){
            previousInput = input;
            input = number.toString();
            clearInput = false;
        } else if( input.equals(INITIAL_VALUE)) {
            input = number.toString();
        }else{
            input += number.toString();
        }
    }
    public void inputOperator(Operator operator){
        if(this.operator != null){
            this.calculateResult();
        }
        this.operator= operator;
        this.clearInput = true;

    }

    public void Clear(){
        input= INITIAL_VALUE;
    }

    public void Percent(){



    }

    public void addDecimal(){
        if(!input.contains(".")){
            input = input + '.';
        }
    }


    private void calculateResult(){
        Double result = 0.0;
        Double valueOne = Double.parseDouble(previousInput);
        Double valueTwo = Double.parseDouble(input);


        switch(operator){
            case Add:
                result = valueOne + valueTwo;
                break;
                
            case Subtract:
                result = valueOne - valueTwo;
                break;
                
            case Divide:
                result = valueOne / valueTwo;
                break;

            case Multiply:
                result = valueOne * valueTwo;
                break;

            case Equal:
                result = valueTwo;
                break;

            case Percent:
                result = valueOne / 100;
                break;

        }

        input = result.toString();

    }

    public String getInput(){
        return this.input;
    }
}
