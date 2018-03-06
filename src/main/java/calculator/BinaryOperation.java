/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 * Интерфейс описывающий операцию над двумя операндами
 * @author Andrey
 */
public interface BinaryOperation {

    /**
     *  Расчитывает результат для двух операндов
     * @param left левый операнд 
     * @param right правый операнд 
     * @return результат операции
     */
    double resultFor(double left, double right);

}
