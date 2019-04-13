package com.rotabuilder.dom.domain.employee;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QShiftOffRequest extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QShiftOffRequest jdoCandidate = candidate("this");

    public static QShiftOffRequest candidate(String name)
    {
        return new QShiftOffRequest(null, name, 5);
    }

    public static QShiftOffRequest candidate()
    {
        return jdoCandidate;
    }

    public static QShiftOffRequest parameter(String name)
    {
        return new QShiftOffRequest(ShiftOffRequest.class, name, ExpressionType.PARAMETER);
    }

    public static QShiftOffRequest variable(String name)
    {
        return new QShiftOffRequest(ShiftOffRequest.class, name, ExpressionType.VARIABLE);
    }

    public final com.rotabuilder.dom.domain.employee.QEmployee employee;
    public final com.rotabuilder.dom.domain.shift.QShift shift;
    public final NumericExpression<Integer> weight;

    public QShiftOffRequest(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.employee = new com.rotabuilder.dom.domain.employee.QEmployee(this, "employee", depth-1);
        }
        else
        {
            this.employee = null;
        }
        if (depth > 0)
        {
            this.shift = new com.rotabuilder.dom.domain.shift.QShift(this, "shift", depth-1);
        }
        else
        {
            this.shift = null;
        }
        this.weight = new NumericExpressionImpl<Integer>(this, "weight");
    }

    public QShiftOffRequest(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.employee = new com.rotabuilder.dom.domain.employee.QEmployee(this, "employee", 5);
        this.shift = new com.rotabuilder.dom.domain.shift.QShift(this, "shift", 5);
        this.weight = new NumericExpressionImpl<Integer>(this, "weight");
    }
}
