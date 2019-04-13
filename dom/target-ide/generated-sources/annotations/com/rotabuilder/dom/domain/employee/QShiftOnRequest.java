package com.rotabuilder.dom.domain.employee;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QShiftOnRequest extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QShiftOnRequest jdoCandidate = candidate("this");

    public static QShiftOnRequest candidate(String name)
    {
        return new QShiftOnRequest(null, name, 5);
    }

    public static QShiftOnRequest candidate()
    {
        return jdoCandidate;
    }

    public static QShiftOnRequest parameter(String name)
    {
        return new QShiftOnRequest(ShiftOnRequest.class, name, ExpressionType.PARAMETER);
    }

    public static QShiftOnRequest variable(String name)
    {
        return new QShiftOnRequest(ShiftOnRequest.class, name, ExpressionType.VARIABLE);
    }

    public final com.rotabuilder.dom.domain.employee.QEmployee employee;
    public final com.rotabuilder.dom.domain.shift.QShift shift;
    public final NumericExpression<Integer> weight;

    public QShiftOnRequest(PersistableExpression parent, String name, int depth)
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

    public QShiftOnRequest(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.employee = new com.rotabuilder.dom.domain.employee.QEmployee(this, "employee", 5);
        this.shift = new com.rotabuilder.dom.domain.shift.QShift(this, "shift", 5);
        this.weight = new NumericExpressionImpl<Integer>(this, "weight");
    }
}
