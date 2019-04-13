package com.rotabuilder.dom.domain.employee;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDayOffRequest extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QDayOffRequest jdoCandidate = candidate("this");

    public static QDayOffRequest candidate(String name)
    {
        return new QDayOffRequest(null, name, 5);
    }

    public static QDayOffRequest candidate()
    {
        return jdoCandidate;
    }

    public static QDayOffRequest parameter(String name)
    {
        return new QDayOffRequest(DayOffRequest.class, name, ExpressionType.PARAMETER);
    }

    public static QDayOffRequest variable(String name)
    {
        return new QDayOffRequest(DayOffRequest.class, name, ExpressionType.VARIABLE);
    }

    public final com.rotabuilder.dom.domain.employee.QEmployee employee;
    public final com.rotabuilder.dom.domain.shift.QShiftDate shiftDate;
    public final NumericExpression<Integer> weight;

    public QDayOffRequest(PersistableExpression parent, String name, int depth)
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
            this.shiftDate = new com.rotabuilder.dom.domain.shift.QShiftDate(this, "shiftDate", depth-1);
        }
        else
        {
            this.shiftDate = null;
        }
        this.weight = new NumericExpressionImpl<Integer>(this, "weight");
    }

    public QDayOffRequest(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.employee = new com.rotabuilder.dom.domain.employee.QEmployee(this, "employee", 5);
        this.shiftDate = new com.rotabuilder.dom.domain.shift.QShiftDate(this, "shiftDate", 5);
        this.weight = new NumericExpressionImpl<Integer>(this, "weight");
    }
}
