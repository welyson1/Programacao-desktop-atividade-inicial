package com.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.model.ex0.Conversores;
import com.model.ex1.Aluno;
import com.model.ex2.Ola;
import com.model.ex3.Inteiro;
import com.model.ex4.InteiroImplemento;
import com.model.ex6.Aluno2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class TelaController implements Initializable {
    //Convesão
    @FXML
    private ChoiceBox<String> choiseConversao;
    //Opcoes para popular o choiceBox
    private String[] opcoesConversao = {"celsius2Fahrenheit", "celsius2Kelvin", "fahrenheit2Celsius", "fahrenheit2Kelvin", "kelvin2Celsius", "kelvin2Fahrenheit"};
    @FXML
    private TextField fieldNumero;
    @FXML
    private Text txtResultadoConversao;

    //Aluno
    @FXML
    private TextField fieldN1;
    @FXML
    private TextField fieldN2;
    @FXML
    private TextField fieldN3;
    @FXML
    private TextField fieldN4;
    @FXML
    private Text ResultadoNotas;
    
    //Saudação
    @FXML
    private Text txtSaudacao;

    //Inteiro
    @FXML
    private TextField fieldSomarValor;
    @FXML
    private TextField fieldSubtrairValor;
    @FXML
    private TextField fieldCarregarValor;
    @FXML
    private TextField fieldDividirValor;
    @FXML
    private TextField fieldMultiplicarValor;
    @FXML
    private Text valorAbs;
    @FXML
    private Text valorNormal;

    //Aluno2
    @FXML
    private TextField fieldP1;
    @FXML
    private TextField fieldP2;
    @FXML
    private TextField fieldP3;
    @FXML
    private TextField fieldP4;
    @FXML
    private Text ResultadoNotasMetodo;

    //Objetos
    Conversores conversores = new Conversores();
    Aluno aluno = new Aluno();
    Ola ola = new Ola();
    Inteiro inteiro = new Inteiro();
    InteiroImplemento inteiroImplemento = new InteiroImplemento();
    Aluno2 aluno2 = new Aluno2();    

    /**
     * Ouvinte do ChoiceBox
     */
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        choiseConversao.getItems().addAll(opcoesConversao);
        choiseConversao.setOnAction(this::getOpcoesConversao);
    }

    /**
     * Pega as opcoes do choiceBox
     * @param event
     */
    public void getOpcoesConversao(ActionEvent event) {
        //Pega o valor da opcao escolhida
        String minhasOpcoes = choiseConversao.getValue();
        
        //Condicionais para chamada das clsses de conversao
        if (minhasOpcoes == "celsius2Fahrenheit") {
            //Passa o valor float do fieldNumero para a clase celsius2Fahrenheit que retorna um float e depois é convertido em String para exibir no txtResultadoConversao
            String resultado = String.valueOf(conversores.celsius2Fahrenheit(Float.parseFloat(fieldNumero.getText())));
            txtResultadoConversao.setText(resultado);
        }
        if (minhasOpcoes == "celsius2Kelvin") {
            //Faz a mesma coisa da primeira condicional
            String resultado = String.valueOf(conversores.celsius2Kelvin(Float.parseFloat(fieldNumero.getText())));
            txtResultadoConversao.setText(resultado);
        } 
        if (minhasOpcoes == "fahrenheit2Celsius") {
            //Faz a mesma coisa da primeira condicional
            String resultado = String.valueOf(conversores.fahrenheit2Celsius(Float.parseFloat(fieldNumero.getText())));
            txtResultadoConversao.setText(resultado);
        }
        if (minhasOpcoes == "fahrenheit2Kelvin") {
            //Faz a mesma coisa da primeira condicional
            String resultado = String.valueOf(conversores.fahrenheit2Kelvin(Float.parseFloat(fieldNumero.getText())));
            txtResultadoConversao.setText(resultado);
        }
        if (minhasOpcoes == "kelvin2Celsius") {
            //Faz a mesma coisa da primeira condicional
            String resultado = String.valueOf(conversores.kelvin2Celsius(Float.parseFloat(fieldNumero.getText())));
            txtResultadoConversao.setText(resultado);
        }
        if (minhasOpcoes == "kelvin2Fahrenheit") {
            //Faz a mesma coisa da primeira condicional
            String resultado = String.valueOf(conversores.kelvin2Fahrenheit(Float.parseFloat(fieldNumero.getText())));
            txtResultadoConversao.setText(resultado);
        }
    }

    /**
     * Verifica a media e returna o status e media final para a interface
     * @param event
     */
    @FXML
    void calcularMedia(ActionEvent event) {
        ResultadoNotas.setText(
            aluno.mediaNotas(
                Float.parseFloat(fieldN1.getText()), 
                Float.parseFloat(fieldN2.getText()), 
                Float.parseFloat(fieldN3.getText()), 
                Float.parseFloat(fieldN2.getText())
            )
        );
    }

    /**
     * com o clicar de um botão na interface retorna uma saudação na interface por meio de label
     */
    @FXML
    void pedirSaudacao(ActionEvent event) {
        txtSaudacao.setText(ola.cumprimenta());
    }

    /**
     * Faz a media das notas atraves de metodos e retorna a media final para a interface grafica
     * @param event
     */
    @FXML
    void calcularMediaMetodo(ActionEvent event) {
        aluno2.recebeNota1(Float.parseFloat(fieldP1.getText()));
        aluno2.recebeNota2(Float.parseFloat(fieldP2.getText()));
        aluno2.recebeNota3(Float.parseFloat(fieldP3.getText()));
        aluno2.recebeNota4(Float.parseFloat(fieldP4.getText()));

        ResultadoNotasMetodo.setText(aluno2.imprimeMédia());
    }

    @FXML
    void carregarValor(ActionEvent event) {
        inteiro.carregaValor(Integer.parseInt(fieldCarregarValor.getText()));
        fieldCarregarValor.clear();
    }

    @FXML
    void devolverValor(ActionEvent event) {
        valorNormal.setText(String.valueOf(inteiro.getValor()));
    }

    @FXML
    void devolverValorAbs(ActionEvent event) {
        valorAbs.setText(String.valueOf(inteiro.devolveValorAbsoluto()));
    }

    @FXML
    void dividirValor(ActionEvent event) {
        String valorTexto = fieldDividirValor.getText();

        int divisor = Integer.parseInt(valorTexto);

        int divResultado = inteiroImplemento.dividePor(divisor);

        inteiro.setValor(divResultado);
    }

    @FXML
    void multiplicarValor(ActionEvent event) {
        String valorTexto = fieldMultiplicarValor.getText();

        int mult = Integer.parseInt(valorTexto);

        int multResultado = inteiroImplemento.multiplicaPor(mult);

        inteiro.setValor(multResultado);

    }

    @FXML
    void somarValor(ActionEvent event) {
        String valorTexto = fieldSomarValor.getText();

        int soma = Integer.parseInt(valorTexto);

        int somaResultado = inteiroImplemento.soma(soma);

        inteiro.setValor(somaResultado);

    }

    @FXML
    void subtrairValor(ActionEvent event) {
        String valorTexto = fieldSomarValor.getText();

        int sub = Integer.parseInt(valorTexto);

        int subResultado = inteiroImplemento.subtrai(sub);

        inteiro.setValor(subResultado);
    }

}

