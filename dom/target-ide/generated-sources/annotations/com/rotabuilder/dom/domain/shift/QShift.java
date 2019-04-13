package com.rotabuilder.dom.domain.shift;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QShift extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QShift jdoCandidate = candidate("this");

    public static QShift candidate(String name)
    {
        return new QShift(null, name, 5);
    }

    public static QShift candidate()
    {
        return jdoCandidate;
    }

    public static QShift parameter(String name)
    {
        return new QShift(Shift.class, name, ExpressionType.PARAMETER);
    }

    public static QShift variable(String name)
    {
        return new QShift(Shift.class, name, ExpressionType.VARIABLE);
    }

    public final com.rotabuilder.dom.domain.shift.QShiftDate shiftDate;
    public final com.rotabuilder.dom.domain.shift.QShiftType shiftType;
    public final NumericExpression<Integer> requiredEmployeeSize;

    public QShift(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.shiftDate = new com.rotabuilder.dom.domain.shift.QShiftDate(this, "shiftDate", depth-1);
        }
        else
        {
            this.shiftDate = null;
        }
        if (depth > 0)
        {
            this.shiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "shiftType", depth-1);
        }
        else
        {
            this.shiftType = null;
        }
        this.requiredEmployeeSize = new NumericExpressionImpl<Integer>(this, "requiredEmployeeSize");
    }

    public QShift(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.shiftDate = new com.rotabuilder.dom.domain.shift.QShiftDate(this, "shiftDate", 5);
        this.shiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "shiftType", 5);
        this.requiredEmployeeSize = new NumericExpressionImpl<Integer>(this, "requiredEmployeeSize");
    }
}
