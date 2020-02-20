/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoFuncionario;

/**
 *
 * @author BRUNOSILVA
 */
public enum EnumTipoFuncionario {

    GERENTE(new Gerente()),
    
    SUPERVISOR(new Supervisor()),
    
    VENDEDOR(new Vendedor());

    private final TipoDeFuncionario tipo;

    EnumTipoFuncionario(TipoDeFuncionario tipo) {
        this.tipo = tipo;
    }

    public TipoDeFuncionario getTipoDeFuncionario() {
        return tipo;

    }

}
