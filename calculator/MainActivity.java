package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final Calculator calculator;
    private EditText display;

    public MainActivity() {
        super();
        calculator = new Calculator();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = this.findViewById(R.id.display);

        Button zeroButton = this.findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(view -> {
            handleInput(0);
        });

        Button oneButton = this.findViewById(R.id.oneButton);
        oneButton.setOnClickListener(view -> {
            handleInput(1);
        });

        Button twoButton = this.findViewById(R.id.twoButton);
        twoButton.setOnClickListener(view -> {
            handleInput(2);
        });

        Button threeButton = this.findViewById(R.id.threeButton);
        threeButton.setOnClickListener(view ->{
            handleInput(3);
        });

        Button fourButton = this.findViewById(R.id.fourButton);
        fourButton.setOnClickListener(view ->{
            handleInput(4);
        });

        Button fiveButton = this.findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(view ->{
            handleInput(5);
        });

        Button sixButton = this.findViewById(R.id.sixButton);
        sixButton.setOnClickListener(view ->{
            handleInput(6);
        });

        Button sevenButton = this.findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(view ->{
            handleInput(7);
        });

        Button eightButton = this.findViewById(R.id.eightButton);
        eightButton.setOnClickListener(view ->{
            handleInput(8);
        });

        Button nineButton = this.findViewById(R.id.nineButton);
        nineButton.setOnClickListener(view ->{
            handleInput(9);
        });

        Button decimalButton = this.findViewById(R.id.decimalButton);
        decimalButton.setOnClickListener(view ->{
            calculator.addDecimal();

        });


        Button additionButton = this.findViewById(R.id.additionButton);
        additionButton.setOnClickListener(view ->{
            handleOperator(Operator.Add);
        });

        Button subtractionButton = this.findViewById(R.id.subtractionButton);
        subtractionButton.setOnClickListener(view ->{
            handleOperator(Operator.Subtract);
        });

        Button multiplicationButton = this.findViewById(R.id.multiplicationButton);
        multiplicationButton.setOnClickListener(view ->{
            handleOperator(Operator.Multiply);
        });

        Button divideButton = this.findViewById(R.id.divideButton);
        divideButton.setOnClickListener(view ->{
            handleOperator(Operator.Divide);
        });

        Button equalButton = this.findViewById(R.id.equalButton);
        equalButton.setOnClickListener(view ->{
            handleOperator(Operator.Equal);
        });

        Button acButton = this.findViewById(R.id.acButton);
        acButton.setOnClickListener(view ->{
            calculator.Clear();
            display.setText("0");
        });

        Button posnegButton = this.findViewById(R.id.posnegButton);
        posnegButton.setOnClickListener(view ->{


        });

        Button percentButton = this.findViewById(R.id.percentButton);
        percentButton.setOnClickListener(view ->{
            handleOperator(Operator.Percent);
        });

    }

    private void handleInput(Integer number) {
        calculator.inputNumber(number);
        display.setText(calculator.getInput());
    }

    private void handleOperator(Operator operator){
        calculator.inputOperator(operator);
        display.setText(calculator.getInput());
    }
}




